public class Camera {
    public Vec3 pos, viewAngl;
    public int fov;

    public Camera(Vec3 pos, Vec3 angl){
        this.pos = pos;
        this.viewAngl = angl;
        this.fov = 90;
    }
}