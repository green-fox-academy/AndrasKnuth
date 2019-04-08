import java.util.stream.IntStream;

public class SumAllElements {
    public static void main(String[] args){
        int[] ai = {3, 4, 5, 6, 7};
        int sum = IntStream.of(ai).sum();
        System.out.println(sum);
    }
}