public class Vec3 {
    public double x, y, z;

    public Vec3( double x, double y, double z) {
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
        double x = this.x * Math.cos(angl.x) - this.y * Math.sin(angl.x);
        double y = this.x * Math.sin(angl.x) + this.y * Math.cos(angl.x);
        return new Vec2(x, y);
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
