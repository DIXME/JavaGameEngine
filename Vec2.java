public class Vec2 {
    double x, y;
    
    public Vec2(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Vec2(int x, int y){
        this.x = (double)x;
        this.y = (double)y;
    }
    
    public Vec2(double x){
        this.x = x;
        this.y = x;
    }
    
    public Vec2(int x){
        this.x = (double)x;
        this.y = (double)x;
    }
    
    public Vec2 add(Vec2 other){
        return new Vec2(this.x + other.x, this.y + other.y);
    }
    
    public Vec2 sub(Vec2 other){
        return new Vec2(this.x - other.x, this.y - other.y);
    }
    
    public Vec2 mul(Vec2 other){
        return new Vec2(this.x * other.x, this.y * other.y);
    }
    
    public Vec2 div(Vec2 other){
        return new Vec2(this.x / other.x, this.y / other.y);
    }
    
    public Vec2 add(double other){
        return new Vec2(this.x + other, this.y + other);
    }
    
    public Vec2 sub(double other){
        return new Vec2(this.x - other, this.y - other);
    }
    
    public Vec2 mul(double other){
        return new Vec2(this.x * other, this.y * other);
    }
    
    public Vec2 div(double other){
        return new Vec2(this.x / other, this.y / other);
    }
};