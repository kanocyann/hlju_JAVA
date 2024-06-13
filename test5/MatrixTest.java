package test5;

public class MatrixTest {
    public static void main(String[] args) throws MatrixMultiplication,IllegalArgumentException {
        double[][] a1 = {{1,2},{2,3}};
        Matrix mat1 = new Matrix(a1);
        double[][] a2 = {{1,3},{2,3}};
        Matrix mat2 = new Matrix(a2);
        Matrix multiply = mat1.multiply(mat2);
        System.out.println(multiply);
    }
}
