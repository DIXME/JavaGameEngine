import java.awt.*;

public class GameObject {
    public String name;
    // only really exist to make syntax easier, more effienct, & readable
    
    public GameObject(String name){
        this.name = name;
    }
    
    public void tick(Graphics g){
        // placeholder so sub classes can override this method
        // the scene will pass the graphics instance to the object
        // so it dose not have to store it iteslf
        this.draw(g);
    }
    
    public void draw(Graphics g){
        // same thing as tick however this is not needed beacuse the scene
        // only calls the tick method mabey we can do somthing with this latter
    }
}