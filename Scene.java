import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel {
    private GameObject[] GameObjects;
    
    public Scene(GameObject[] GameObjects, WindowManager wm){
        this.GameObjects = GameObjects;
    }
    
    public void addObject(GameObject object){
        this.GameObjects[ this.GameObjects.length - 1 ] = object;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // tick every object (drawable objects will draw them selfs)
        for( GameObject Obj : this.GameObjects ) {
            // tick every object and pass our graphics instance so they can
            // draw themselfs if they want
            Obj.tick(g);
        };
    }
}