package dzMatrix;



public class Matrix implements IMatrix {
    private double[][] numbers;


    public Matrix(int row, int col) {
        numbers = new double[row][col];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!");
            return -1;
        }

        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!");
            return -1;

        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!");
            return;
        }

        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!");
            return;

        }
        numbers[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //this - первая матрица
        //otherMatrix - вторая матрица
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не одинаковое кол-во колонок!");
            return null;
        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не одинаковое кол-во строк!");
            return null;
        }
        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return matrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return matrix;
    }

    @Override
    //умножение матриц
    //количество столбцов в первой матрице должно быть равно количеству строк во второй матрице
    //результирующая матрица будет иметь столько же строк сколько в первой и столько же столбцов сколько во второй
    //перемножив исходную на транспонированую получим квадратную матрицу с размерностью m x m
    //Умножив матрицу A (m,n) x AT (n,m) = AA (m,m)
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix matrix =  new Matrix(getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++){ //пробегаем по строкам первой матрицы
            for (int j = 0; j < otherMatrix.getColumns(); j++){ //пробегаем по столбцам второй матрицы
                for (int k = 0; k < otherMatrix.getRows(); k++){ //пробегаем по столбцам первой (строкам второй)
                    matrix.setValueAt(i, j, this.getValueAt(i, k)  * otherMatrix.getValueAt(k, j) + matrix.getValueAt(i, j));
                }
            }
        }
        return matrix;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix matrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++){
            for (int j = 0; j < getColumns(); j++){
                matrix.setValueAt(i, j, getValueAt(i, j) * value);
            }
        }

        return matrix;
    }

    @Override
    // не работает
//    int[][] masAT = new int[n][m];
//
//        for (int i = 0; i < m; i++) {
//        for (int j = 0; j < n; j++) {
//            masAT[j][i] = masA[i][j];
//            }
//           }
    public IMatrix transpose() {
        Matrix matrix = new Matrix(getColumns(), getRows());
        for (int i = 0; i < getColumns(); i++){
            for (int j = 0; j < getRows(); j++){
                matrix.setValueAt(i, j, getValueAt(j, i));
            }
        }
        return matrix;
    }

    @Override
    public void fillMatrix(double value) {
        Matrix matrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++){
            for (int j = 0; j < getColumns(); j++){
                matrix.setValueAt(i, j, value);
            }
        }
        return;
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < getRows(); i++){
            for (int j = 0; j < getColumns(); j++){
                if (numbers[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < getRows(); i++){
            for (int j = 0; j < getColumns(); j++){
                if (getRows() == getColumns() && numbers[i][j] == 1){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < getRows(); i++){
            for (int j = 0; j < getColumns(); j++){
                if (getRows() != getColumns()){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < getRows(); i++){
            for (int j = 0; j < getColumns(); j++){
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
