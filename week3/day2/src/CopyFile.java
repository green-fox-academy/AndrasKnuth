import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CopyFile {
    public static void main(String[] args) {
        String file1 = "my-file.txt";
        String file2 = "my-text.txt";
        System.out.println(Copy(file1, file2));
    }
    private static boolean Copy(String fileFrom, String fileTo){
        boolean success = true;
        try {
            Path fileFromPath = Paths.get("assets/" + fileFrom);
            Path fileToPath = Paths.get("assets/" + fileTo);
            Files.copy(fileFromPath, fileToPath);
        } catch (IOException e) {
            success = false;
        }
        return success;
    }
}

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful