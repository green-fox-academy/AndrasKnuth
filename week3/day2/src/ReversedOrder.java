import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        String path = "src/reversed-order.txt";
        Path src = Paths.get(path);
        try {
            List<String> order = Files.readAllLines(src);
            Collections.reverse(order);

        } catch (IOException e){
            System.out.println("The file does not exist.");
        }
    }
}
