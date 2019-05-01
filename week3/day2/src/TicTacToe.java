import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static String ticTacResult(String file) {
        Path path = Paths.get(file);
        String winner = "Draw";
        try {
            List<String> ticTac = Files.readAllLines(path);
            String[][] matrix = new String[3][3];
            for(int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    String s = ticTac.get(i).substring(j, j + 1);
                    matrix[i][j] = s;
                }
            }
            for (int j = 0; j < matrix.length; j++) {
                String firstItem = matrix[j][0];
                if (firstItem.equals(matrix[j][1]) && firstItem.equals(matrix[j][2])) {
                    winner = firstItem;
                    break;
                }
            }
            for (int j = 0; j < matrix.length; j++) {
                String firstItem = matrix[0][j];
                if (firstItem.equals(matrix[1][j]) && firstItem.equals(matrix[2][j])) {
                    winner = firstItem;
                    break;
                }
            }
            if (matrix[2][2].equals(matrix[0][0]) && matrix[2][2].equals(matrix[1][1]) ||
                    matrix[0][2].equals(matrix[2][0]) && matrix[1][1].equals(matrix[0][2])){
                winner = matrix[2][2];
            }
        } catch (IOException e) {
            System.out.println("The file does not exist.");
        }
        return winner;
    }

    public static void main(String[] args) {
        System.out.println(ticTacResult("src/win-o.txt"));
        System.out.println(ticTacResult("src/win-x.txt"));
        System.out.println(ticTacResult("src/draw.txt"));
    }
}
