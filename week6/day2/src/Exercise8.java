import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    List<Character> example = Arrays.asList('d', 'ú', 'r');
    String truba = "truba";
    System.out.println(concatenate(example, truba));
  }

  public static String concatenate(List<Character> e, String t){
    String output = e.stream()
        .map(ch -> ch.toString())
        .collect(Collectors.joining());
    return t.concat(output);
  }
}
//Write a Stream Expression to concatenate a Character list to a string!