import java.awt.*;

public class GameObject2d extends GameObject {
    public String name;
    public Vec2 pos, vel;
    public double rot, rotVel;
    
    public GameObject2d(String name, Vec2 pos, double rot){
        super(name);
        this.pos = pos;
        this.rot = rot;
        this.vel = new Vec2(0);
        this.rotVel = (double)0;
    }
    
    @Override
    public void tick(Graphics g){
        this.pos = this.pos.add(this.vel);
        this.vel = this.vel.mul(Constants.friction);
        this.rot += this.rotVel;
        this.rotVel = this.rotVel * Constants.friction;
        this.draw(g);
    }
}