import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsAnagramTest {
  IsAnagram isAnagram;

  @Before
  public void setup() {
    isAnagram = new IsAnagram();
  }

  @Test
  public void isAnagramTest() {
    String a = "abcdef";
    String b = "fedabc";
    assertEquals(true, isAnagram.isAnagram(a, b));
  }

  @Test
  public void notAnagramTest() {
    String a = "asfasra";
    String b = "afgsrgs";
    assertEquals(false, isAnagram.isAnagram(a, b));
  }

  @Test
  public void differntLength() {
    String a = "abcdef";
    String b = "abcdefg";
    assertEquals(false, isAnagram.isAnagram(a, b));
  }

  @Test
  public void isCaseInsensitive() {
    String a = "abcdef";
    String b = "Fedabc";
    assertEquals(true, isAnagram.isAnagram(a, b));
  }
  @Test
  public void isTypesensitive() {
    String a = "macska ";
    String b = "csakma";
    assertEquals(false, isAnagram.isAnagram(a, b));
  }




}
