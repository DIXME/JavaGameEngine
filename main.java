import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        //creating instance of JFrame
        JFrame frame = new JFrame("My First Window");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Graphics g = frame.getGraphics();
        g.setColor(new Color(255,35,35));
        g.drawRect(0, 0, 50, 50);
        frame.repaint();
    }
}