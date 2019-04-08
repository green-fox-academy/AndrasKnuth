public class Matrix {
    public static void main(String[] args) {
        int a = 5;
        int[][] matrix = new int [a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                else {
                    matrix [i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}