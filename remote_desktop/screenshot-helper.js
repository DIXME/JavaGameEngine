// npm install express socket.io screenshot-desktop
const screenshot = require('screenshot-desktop');

async function getFrame() {
  try {
    // returns Buffer of JPEG by default
    const imgBuffer = await screenshot();
    return imgBuffer;
  } catch (err) {
    console.error('Screenshot error:', err);
  }
}

module.exports = {getFrame}