import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

    public static void main(String[] args) {
        Extension extension = new Extension();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a.size());
        System.out.println(extension.median(a));
        String h = "bemutatkozik";
        System.out.println(extension.translate(h));
    }
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > b)
            return a;
        else if (c > b)
            return c;
        else
            return b;
    }

    int median(List<Integer> pool) {
        return pool.get((pool.size()-1)/2);
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}
