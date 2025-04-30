public class Vec3 {
    double x, y, z;
    
    public Vec3(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.y = z;
    }

    public Vec3(double b){
        this.x = b;
        this.y = b;
        this.z = b;
    }

    public Vec3(int b){
        this.x = (double)b;
        this.y = (double)b;
        this.z = (double)b;
    }

    public Vec3(float b){
        this.x = (double)b;
        this.y = (double)b;
        this.z = (double)b;
    }
    
    public Vec3 add(Vec3 other){
        return new Vec3(this.x + other.x, this.y + other.y, this.z + other.z);
    }
    
    public Vec3 sub(Vec3 other){
        return new Vec3(this.x - other.x, this.y - other.y, this.z - other.z);
    }
    
    public Vec3 mul(Vec3 other){
        return new Vec3(this.x * other.x, this.y * other.y, this.z * other.z);
    }
    
    public Vec3 div(Vec3 other){
        return new Vec3(this.x / other.x, this.y / other.y, this.z / other.z);
    }
    
    public Vec3 add(double other){
        return new Vec3(this.x + other, this.y + other, this.z + other);
    }
    
    public Vec3 sub(double other){
        return new Vec3(this.x - other, this.y - other, this.z - other);
    }
    
    public Vec3 div(double other){
        return new Vec3(this.x / other, this.y / other, this.z / other);
    }
    
    public Vec3 mul(double other){
        return new Vec3(this.x * other, this.y * other, this.z * other);
    }

    public Vec3 fromDouble(double other){
        return new Vec3(other,other,other);
    }

    public Vec3 fromInt(int x){
        return new Vec3((double)x, (double)x, (double)x);
    }

    public Vec3 fromFloat(float x){
        return new Vec3((double)x, (double)x, (double)x);
    }
}