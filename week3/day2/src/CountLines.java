import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class CountLines {
    public static void main(String[] args) {
        System.out.println(countLines("my-file.txt"));
    }
    private static int countLines(String s) {
        int result = 0;
        try {
            Path src = Paths.get("assets/" + s);
            List<String> lines = Files.readAllLines(src);
            for (String line : lines) {
                result++;
            }
        } catch (Exception e) {
            return 0;
        }
        return result;
    }
}
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
