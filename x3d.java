public class x3d {
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
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
    
    public double[][][] getRotMartices(Vec3 pos, Vec3 angl){
        double cx = Math.cos(angl.x);
        double sx = Math.sin(angl.x);

        double cy = Math.cos(angl.y);
        double sy = Math.sin(angl.y);

        double cz = Math.cos(angl.z);
        double sz = Math.sin(angl.z);
        
        double[][] rotaionMartix3x = {
            {1,  0,  0},
            {0, cx,-sx},
            {0, sx, cx}
        };
        
        double[][] rotaionMartix3y = {
            {cy, 0, sy},
            { 0, 1, 0 },
            {-sy, 0, cy}
        };
        
        double[][] rotaionMartix3z = {
            {cz, -sz, 0},
            {sz,  cz, 0},
            {0,   0,  1}
        };

        return new double[][][] {
            rotaionMartix3x,
            rotaionMartix3y,
            rotaionMartix3z
        };
    }

    public Vec3 rotate3d(Vec3 point, Vec3 angl){
        double[][][] rotationMatrices = getRotMartices(point, angl);
        double[][] result = new double[3][1];
        double[][] pointMatrix = {{point.x}, {point.y}, {point.z}};

        for (double[][] rotationMatrix : rotationMatrices) {
            result = multiplyMatrices(rotationMatrix, pointMatrix);
            pointMatrix = result;
        }

        return new Vec3(result[0][0], result[1][0], result[2][0]);
    }

    public Vec2 projectPoint(Vec3 point){
        return new Vec2(0d,0d);
    }
}