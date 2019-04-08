public class Matrix {
    public static void main(String[] args){
        int a = 5;
        int[][] matrix = new int [a][a];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if (i == j){
                    matrix[i][j] = 1;
                }
                else {
                    matrix [i][j] = 0;
                }
                System.out.println(matrix[i][j]);

            }

            System.out.println();
        }
    }
}
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output