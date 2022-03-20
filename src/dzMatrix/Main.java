package dzMatrix;

public class Main {
    public static void main(String[] args) {
        // Matrix matrix1 = new Matrix(3, 4);
        // System.out.println(matrix1.getRows());
        //System.out.println(matrix1.getColumns());

        double[][] num2 = {{2, 4, 6},
                           {4, 1, 5},
                           {2, 8, 9},
                           {5, 6, 7}};
        Matrix matrix2 = new Matrix(num2);
        double[][] num1 = {{5, 4, 5},
                           {4, 8, 3},
                           {2, 7, 7}};

        Matrix matrix1 = new Matrix(num1);
        double[][] num3 = {{0, 0, 0},
                           {0, 0, 0},
                           {0, 0, 0}};
        Matrix matrix3 = new Matrix(num3);

        matrix2.mul(matrix1).printToConsole();
    }
}
