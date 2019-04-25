import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

public class CountLettersTest {
    CountLetters countLetters;

    @Before
    public void setup(){
        countLetters = new CountLetters();
    }

    @Test
    public void countLettersTest(){
        String i = "beabeabea";
        HashMap<Character, Integer> result = new HashMap<>();
        result.put('a', 3);
        result.put('b', 3);
        result.put('e', 3);
        assertEquals(CountLetters.characterCount(i), result);
    }
}
