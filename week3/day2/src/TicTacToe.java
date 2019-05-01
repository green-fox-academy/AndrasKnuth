import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TicTacToe {

    public String ticTacResult(String file){
        Path path = Paths.get(file);

        try {
            int [][] ticTac = Files.readAllLines(path);


        } catch (IOException e) {
            System.out.println("The file does not exist.");
        }
    }

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file
        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"
        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"
        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }
}
