import java.awt.Color;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        WindowManager wm = new WindowManager("Window Title", 800, 800);
        Rect2d box = new Rect2d(new Vec2(25d,25d), new Vec2(50d,50d), Color.WHITE);
        ArrayList objects = new ArrayList<Object2d>();
        objects.add(box);
        Scene2d scene = new Scene2d(wm.graphics, objects);
        wm.setScene(scene);
        wm.graphics.draw();
    }
}