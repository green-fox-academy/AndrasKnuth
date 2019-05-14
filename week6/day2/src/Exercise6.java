import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {
    String example = "gargRBegaethDGBETAHrBFDAbdagbA";
    String capitalLetters = example.chars()
        .filter(Character::isUpperCase)
        .mapToObj(c -> Character.toString((char)c))
        .collect(Collectors.joining());
    System.out.println(capitalLetters);

  }
}
//Write a Stream Expression to find the uppercase characters in a string!