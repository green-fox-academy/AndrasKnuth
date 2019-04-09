import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> Finances = Arrays.asList(500, 1000, 1250, 175, 800, 120);
        int sum = Finances.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(Collections.max(Finances));
        System.out.println(Collections.min(Finances));
        System.out.println(sum/Finances.size());
    }
}
