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
    String s = "silent";
    String s1 = "listen";
    assertEquals(true, Anagram.areAnagram(s,s1));
}

    @Test
    public void notAnagramTest(){
        String s = "silent";
        String s1 = "music";
        assertNotEquals(true, Anagram.areAnagram(s,s1));
    }

}
