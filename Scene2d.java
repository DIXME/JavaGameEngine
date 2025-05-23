import java.util.ArrayList;

public class Scene2d {
    private ArrayList<Object2d> gameObjects;
    private MyGraphics graphics; // MyGraphics Instance From WindowManager

    public Scene2d(MyGraphics graphics, ArrayList<Object2d> gameObjects) {
        this.graphics = graphics;
        this.gameObjects = gameObjects;
    }

    public void tick() {
        for (Object2d obj : this.gameObjects){
            System.out.println("Drawing Object");
            obj.tick(this.graphics);
        }
    }

    public void addObject(Object2d obj){
        this.gameObjects.add(obj);
    }

    public void removeObject(Object2d obj){
        this.gameObjects.remove(obj);
    }
    
    public ArrayList<Object2d> getObjects(){
        return gameObjects;
    }
}