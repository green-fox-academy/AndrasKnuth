public class MatrixCompare {

    public int [][] matrixCompare(int [][] matrixA, int [][] matrixB) {
        int [][] newMatrix = new int[2][2];
        for(int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixB.length; j++){
                if (matrixA[j][i] > matrixB[j][i]){
                    newMatrix[j][i] = matrixA[j][i];
                } else if (matrixA[j][i] < matrixB[j][i]){
                    matrixB[j][i] = newMatrix[j][i];
                    for (int x = 0; x < newMatrix.length; x++) {
                        for (int y = 0; y < newMatrix[x].length; y++) {
                            System.out.print(newMatrix[x][y] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {

        MatrixCompare matrixCompare = new MatrixCompare();

        int [][] matrixOne = {{2,1},
                              {0,1}};
        int [][] matrixTwo = {{0,3},
                              {-1,1}};
        matrixCompare.matrixCompare(matrixOne, matrixTwo);
    }
}

/*
•	Write a method which takes two matrices as parameters and returns a new matrix.
•	The method should compare each element in the input matrices and fill the returned matrix with the greater values.
•	You only have to deal with square matrices. A square matrix is a matrix with the same number of rows and columns.
•	Write 2 different test cases for the method.

 */