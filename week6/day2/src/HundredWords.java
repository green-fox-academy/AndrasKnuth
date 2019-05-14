import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HundredWords {
  public static void main(String[] args) {
    String file = "src/wikipage.txt";
    Path path = Paths.get(file);

    try {
      List<String> words = Files.readAllLines(path);
      Map<String, Long> out = words.stream()
          .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
      System.out.println(out);
    } catch (IOException e){
      System.out.println("No file found goddammit!");
    }
  }
}
/*
Create a Stream expression which reads all text from this file,
and prints the 100 most common words in descending order.
Keep in mind that the text contains punctuation characters which should be ignored.
 */