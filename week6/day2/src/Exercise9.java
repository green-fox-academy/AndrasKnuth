import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    String example = "el mundo fantastico";
    Map<Object, Long> charFrequency = example.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    System.out.println(charFrequency);

  }
   /* public static List<Character> convertStringToCharList(String s) {
      List<Character> chars = s.chars()
          .mapToObj(e -> (char)e)
          .collect(Collectors.toList());
      return chars;
    } */
}
//Write a Stream Expression to find the frequency of characters in a given string!
