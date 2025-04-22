import java.awt.Color;

public class Rect2d extends Object2d {
    private Vec2 whv; // width & height vector
    private Color color = Color.blue; // default color

    public Rect2d(Vec2 pos, Vec2 whv, Color color) {
        super(pos);
        this.whv = whv;
        this.color = color;
    }

    public void draw(MyGraphics g){
        g.drawRect(this.getPos(), this.whv, this.color);
    }

    public Vec2 getWhv(){
        return this.whv;
    }

    @Override
    public String toString(){
        return "Pos: " + this.getPos().toString() + ", Vel: " + this.getVel().toString() + ", Whv: " + this.whv.toString();
    }
}