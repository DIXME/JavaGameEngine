import java.awt.*;

public class GameObject3d extends GameObject {
    public String name;
    public Vec3 pos, vel, rot, rotVel;
    
    public GameObject3d(String name, Vec3 pos, Vec3 rot){
        super(name);
        this.pos = pos;
        this.rot = rot;
        this.vel = new Vec3(0);
        this.rotVel = new Vec3(0);
    }
    
    @Override
    public void tick(Graphics g){
        this.pos = this.pos.add(this.vel);
        this.vel = this.vel.mul(Constants.friction);
        this.rot = this.rot.add(this.rotVel);
        this.rotVel = this.rotVel.mul(Constants.friction);
        this.draw(g);
    }
}