public class Vec3 {
    public float x, y, z;

    public Vec3( float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3 add(Vec3 v) {
        return new Vec3(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vec3 subtract(Vec3 v) {
        return new Vec3(this.x - v.x, this.y - v.y, this.z - v.z);
    }
    
    public Vec3 multiply(Vec3 other) {
        return new Vec3(this.x * other.x, this.y * other.y, this.z * other.z);
    }
    
    public Vec3 divide(Vec3 other) {
        return new Vec3(this.x / other.x, this.y / other.y, this.z / other.z);
    }

    public Vec2 project(Vec3 angl) {
        float x = this.x * (float) Math.cos(angl.x) - this.y * (float) Math.sin(angl.x);
        float y = this.x * (float) Math.sin(angl.x) + this.y * (float) Math.cos(angl.x);
        return new Vec2(x, y);
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
