import javax.swing.*;
import java.awt.*;

public class WindowManager {
    public String title;
    public int width;
    public int height;
    public Graphics g;
    
    public JFrame jframe;
    
    public WindowManager(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
        // create and manage jframe instance
        this.jframe = new JFrame(this.title);
        this.jframe.setSize(this.width, this.height);
        // mabey we will ad a closing callback that the user can
        // specify?
        this.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // show window
        this.jframe.setVisible(true);
    }
}