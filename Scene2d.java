import java.util.ArrayList;

public class Scene2d {
    private ArrayList<Object2d> gameObjects;
    private MyGraphics graphics;

    public Scene2d(MyGraphics graphics, ArrayList<Object2d> gameObjects) {
        this.graphics = graphics;
        this.gameObjects = new ArrayList<Object2d>();
    }

    public void tick() {
        
        for (Object2d obj : this.gameObjects){
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