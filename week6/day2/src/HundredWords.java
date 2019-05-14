import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HundredWords {
  public static void main(String[] args) {
    List<String> content = readTheFile();
    Map<String, Integer> wordOccupancies = content.stream()
        .flatMap(str -> Arrays.stream(str.split("\\s")))
        .map(gg -> gg.replaceAll("[^a-zA-Z ]", ""))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));

    wordOccupancies.entrySet().stream()
        .limit(100)
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        .filter(map -> !"".equals(map.getKey()))
        .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

  }

  private static List<String> readTheFile() {

    List<String> content = new ArrayList<>();
    Path filePath = Paths.get("src/wikipage.txt");
    try {
      content = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Oops, something wrong happened with the file!");
    }
    return content;
  }
}


/*
Create a Stream expression which reads all text from this file,
and prints the 100 most common words in descending order.
Keep in mind that the text contains punctuation characters which should be ignored.
 */