import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        String path = "src/duplicated-chars.txt";
        Path src = Paths.get(path);

        try {
            List <String> content = Files.readAllLines(src);
            List <String> newContent = new ArrayList<>();
            String decoded;
            for (String line : content) {
                decoded = "";
                char[] lineChars = line.toCharArray();
                for (int i = 0; i < lineChars.length; i++){
                    if (i % 2 == 0) {
                        decoded += lineChars[i];
                    }
                }
                newContent.add(decoded);
                System.out.println(decoded + "\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
