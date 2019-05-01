import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        String path = "src/reversed-lines.txt";
        Path src = Paths.get(path);

        try {
            List<String> content = Files.readAllLines(src);
            List <String> reversedContent = new ArrayList<>();
            String reversedLine;

            for (String line : content){
                reversedLine = "";
                char[] lineChars = line.toCharArray();
                for(int i = 0; i <lineChars.length; i++){
                    reversedLine += lineChars[lineChars.length - 1 - i];
                }
                reversedContent.add(reversedLine);

            }
            Files.write(src, reversedContent);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

