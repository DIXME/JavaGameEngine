import javax.swing.*;
import java.awt.*;

public class WindowManager extends JPanel {
    private JFrame frame;
    public Scene2d scene2d; // Assuming Scene2d is a class you have defined elsewhere

    // Constructor to create the window
    public WindowManager(String title, int width, int height) {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this); // Add this JPanel to the JFrame
        frame.setVisible(true);
    }

    // Override paintComponent to draw on the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass method to ensure proper rendering
        if (scene2d != null) {
            scene2d.tick(); // Call the tick method of Scene2d to draw objects
        }
    }
}
