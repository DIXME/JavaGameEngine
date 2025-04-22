import java.awt.*;
import java.util.ArrayList;

public class MyGraphics {
    WindowManager windowManager;
    Graphics graphics;
    
    public MyGraphics(String title, int width, int height) {
        this.windowManager = new WindowManager(title, width, height);
        this.graphics = windowManager.getGraphics(); // Get the graphics context from the window manager
    }

    public void draw() {
        this.clear(Color.WHITE); // Clear the window with a white background
        windowManager.repaint(); // Trigger a repaint to draw the graphics
    }

    public void drawLine(Vec2 point1, Vec2 point2, Color color) {
        this.graphics.setColor(color);
        this.graphics.drawLine((int)point1.x, (int)point1.y, (int)point2.x, (int)point2.y);
    }

    public void drawRect(Vec2 pos, Vec2 whv, Color color) {
        this.graphics.setColor(color);
        this.graphics.drawRect((int)pos.x, (int)pos.y, (int)whv.x, (int)whv.y);
    }

    public void drawOval(Vec2 pos, Vec2 whv, Color color) {
        this.graphics.setColor(color);
        this.graphics.drawOval((int)pos.x, (int)pos.y, (int)whv.x, (int)whv.y);
    }

    public void drawString(String text, Vec2 point, Color color) {
        this.graphics.setColor(color);
        this.graphics.drawString(text, (int)point.x, (int)point.y);
    }

    public void setColor(Color color) {
        this.graphics.setColor(color);
    }

    public void setFont(Font font) {
        this.graphics.setFont(font);
    }

    public void clear(Color color) {
        this.graphics.setColor(color);
        this.graphics.fillRect(0, 0, windowManager.getWidth(), windowManager.getHeight());
    }

    public void connectPoints2d(ArrayList<Vec2> points, Color color){
        this.graphics.setColor(color);
        for (int i = 0; i < points.size() - 1; i++) {
            Vec2 p1 = points.get(i);
            Vec2 p2 = points.get(i + 1);
            this.graphics.drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
        }
    }
}
