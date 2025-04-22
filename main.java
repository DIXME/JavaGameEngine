import java.awt.Color;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        MyGraphics graphics = new MyGraphics("Game", 800, 600);
        Rect2d box = new Rect2d(new Vec2(100, 100), new Vec2(50, 50), Color.RED);
        ArrayList<Object2d> objects = new ArrayList<Object2d>();
        objects.add(box);
        Scene2d scene = new Scene2d(graphics, objects);
    }
}