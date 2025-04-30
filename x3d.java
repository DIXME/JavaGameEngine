public class x3d {
    // i have to use this because my tunnle crashed i am NOT remaking ts
    // these rotaion functions only work when the 3d object is at the cords 0 0 0 beacuse thats just how the martix functions so i need to create translations
    
    public static double[][] projectionMartix(Vec3 point, Camera cam){
        double[][] mat = {
            {1/(cam.aspectRatio*Math.tan(cam.fov/2)),0,0,0},
            {0,1/Math.tan(cam.fov/2),0,0},
            {0,0,(cam.far+cam.near)/(cam.far-cam.near),-2*(cam.far*cam.near)/cam.far-cam.near},
            {0,0,-1,0}
        };
        return mat;
    }
    
    public static double[][] translationMartix(Vec3 Point, Vec3 t) {
        double[][] matrtix = {
            {1, 0, 0, t.x},
            {0, 1, 0, t.y},
            {0, 0, 1, t.z},
            {0, 0, 0,   1}
        };
        return matrtix;
    }
    
    public static double[][] multiplyMartices(double[][] matrix1, double[][] matrix2){
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        if (cols1 != matrix2.length) {
            throw new IllegalArgumentException("Matrices cannot be multiplied: Incompatible dimensions.");
        }

        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    
    public static Vec3 translatePoint(Vec3 point, Vec3 t){
        double[][] pointMartix = {
            {point.x},
            {point.y},
            {point.z},
            {(double)1}
        };
        double[][] translationMartix = translationMartix(point,t);
        double[][] result = multiplyMartices(pointMartix, translationMartix);
        return new Vec3(result[0][0], result[1][0], result[2][0]);
    }
    
    public static Vec3 rotateX(Vec3 pos, double theta) {
        double cosTheta = Math.cos(theta);
        double sinTheta = Math.sin(theta);
        double yNew = pos.y * cosTheta - pos.z * sinTheta;
        double zNew = pos.y * sinTheta + pos.z * cosTheta;
        return new Vec3(pos.x, yNew, zNew);
    }

    public static Vec3 rotateY(Vec3 pos, double theta) {
        double cosTheta = Math.cos(theta);
        double sinTheta = Math.sin(theta);
        double xNew = pos.x * cosTheta + pos.z * sinTheta;
        double zNew = -pos.x * sinTheta + pos.z * cosTheta;
        return new Vec3(xNew, pos.y, zNew);
    }

    public static Vec3 rotateZ(Vec3 pos, double theta) {
        double cosTheta = Math.cos(theta);
        double sinTheta = Math.sin(theta);
        double xNew = pos.x * cosTheta - pos.y * sinTheta;
        double yNew = pos.x * sinTheta + pos.y * cosTheta;
        return new Vec3(xNew, yNew, pos.z);
    }

    public static Vec3 rotateXYZ(Vec3 pos, Vec3 angl){
        Vec3 new_pos;
        new_pos = rotateX(pos,angl.z);
        new_pos = rotateY(pos,angl.y);
        new_pos = rotateZ(pos,angl.x);
        return new_pos;
    }
    
    public static Vec3[][] rotate3dFaces(Vec3 OriginalPos, Vec3[][] faces, Vec3 angl, Camera cam){
        
        // this will take into account if the object is not @ the origin by using the translaion martix to put it in the center an placing it back where it was orignaly (OriginalPos)
        
        for (int i = 0; i < faces.length; i++) {
            for (int j = 0; j < faces[i].length; j++) {
                faces[i][j] = translatePoint(faces[i][j], new Vec3(0, 0, 0));
                faces[i][j] = rotateXYZ(faces[i][j], angl);
                faces[i][j] = translatePoint(faces[i][j],OriginalPos);
            }
        }
        
        return faces;
    }
    
    public static Vec3[] cubeVerts(Vec3 pos, Vec3 whv){
        Vec3 bottomLeftBack  = new Vec3(pos.x, pos.y, pos.z);
        Vec3 bottomRightBack = new Vec3(pos.x, pos.y, pos.z);
        Vec3 topLeftBack     = new Vec3(pos.x, pos.y, pos.z);
        Vec3 topRightBack    = new Vec3(pos.x, pos.y, pos.z);

        return new Vec3[] { bottomLeftBack, bottomRightBack, topLeftBack, topRightBack };
    }
}