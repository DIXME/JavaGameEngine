class Camera extends GameObject3d {
    public int fov;
    public double aspectRatio;
    public double near;
    public double far;
    
    public Camera(String name, Vec3 pos, Vec3 rot, int fov, double aspectRatio, double near, double far){
        super(name,pos,rot);
        this.fov = fov;
        this.aspectRatio = aspectRatio;
        this.near = near;
        this.far = far;
    }
    
    // everything is sufficently updated by the defualt tick & draw command
    // so we require no overrides
}