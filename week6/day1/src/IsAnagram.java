import java.util.Arrays;

public class IsAnagram {
  public boolean isAnagram(String one, String two) {
    if (one.length() != two.length()) {
      return false;
    }
    char[] c1 = one.toLowerCase().toCharArray();
    char[] c2 = two.toLowerCase().toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    String stringOne = new String(c1);
    String stringTwo = new String(c2);
    return stringOne.equals(stringTwo);
  }
}

