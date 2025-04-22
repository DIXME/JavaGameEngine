public class Object2d {
    private Vec2 pos, vel;

    public Object2d(Vec2 pos) {
        this.pos = pos;
        this.vel = new Vec2(0, 0);
    }

    public void draw(MyGraphics g) {
        // Placeholder for drawing logic
        System.out.println("Drawing object at position: " + pos.x + ", " + pos.y);
    }

    public void tick(MyGraphics g) {
        this.pos = this.pos.add(this.vel);
        this.vel = this.vel.multiply(new Vec2(0.9f, 0.9f)); // Apply some damping to the velocity
        this.draw(g);
    }

    public Vec2 getPos(){
        return pos;
    }

    public void setPos(Vec2 new_pos){
        this.pos.x = new_pos.x;
        this.pos.y = new_pos.y;
    }

    public Vec2 getVel(){
        return this.vel;
    }

    public void push(Vec2 force){
        this.vel.x += force.x;
        this.vel.y += force.y;
    }
}