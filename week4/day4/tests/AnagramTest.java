import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {
Anagram anagram;

@Before
    public void setup(){
    anagram = new Anagram();
}

@Test
    public void anagramTest(){
    char[] s = {'s', 'i', 'l', 'e', 'n', 't'};
    char[] s1 = {'l', 'i', 's', 't', 'e', 'n'};
    assertEquals(true, Anagram.areAnagram(s,s1));
}

}
