import java.util.Arrays;
import java.util.List;

public class Exercise1 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
  }
}
//Write a Stream Expression to get the even numbers from the following list: