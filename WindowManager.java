import javax.swing.*;
import java.awt.*;

public class WindowManager extends JPanel {
    private JFrame frame;
    private Scene2d scene2d; // Assuming Scene2d is a class you have defined elsewhere
    public MyGraphics graphics;
    // Constructor to create the window
    public WindowManager(String title, int width, int height) {
        this.frame = new JFrame(title);
        this.frame.setSize(width, height);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.add(this); // Add this JPanel to the JFrame
        this.frame.setVisible(true);
        this.graphics = new MyGraphics(this);
    }

    // Override paintComponent to draw on the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass method to ensure proper rendering
        this.scene2d.tick(); // Call the tick method of Scene2d to draw objects
    }

    public void setScene(Scene2d scene){
        this.scene2d = scene;
    }
}
