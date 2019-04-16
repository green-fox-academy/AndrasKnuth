import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        writeALine("assets/my-file.txt", "András Knuth");
    }
    private static void writeALine(String filename, String name){
        List<String> content = new ArrayList<>();
        content.add(name);
        try {
            Path filePath = Paths.get(filename);
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
