const express = require('express');
const http = require('http');
const socketIo = require('socket.io');
const robot = require('robotjs'); // clicks

const { getFrame } = require('./screenshot-helper'); // from above

const app = express();
const server = http.createServer(app);
const io = socketIo(server);

app.get('/', function(req, res){
  res.sendFile(__dirname + '/index.html');
})

io.on('connection', (socket) => {
  console.log('Client connected');
  const interval = setInterval(async () => {
    const img = await getFrame();
    socket.emit('frame', img.toString('base64'));
  }, 100); // ~10 FPS

  socket.on('disconnect', () => {
    clearInterval(interval);
    console.log('Client disconnected');
  });

  socket.on('click', ({ nx, ny }) => {
    // get your primary screen size
    const screenSize = robot.getScreenSize();
    const realX = Math.floor(nx * screenSize.width);
    const realY = Math.floor(ny * screenSize.height);
    console.log('Clicked: '+realX+","+realY)

    // move smoothly and click
    robot.moveMouseSmooth(realX, realY);
    robot.mouseClick();  // left‑button click
  });
});

server.listen(35, () => console.log('Server listening on port 35'));