public class Strings {
    public static void main(String[] args) {
        System.out.println(strings("Hello kenny, x-edik lettel!"));
    }

    public static String strings(String text) {
        int positionX;
        positionX = text.indexOf("x");
        char[] letters = text.toCharArray();

        if (positionX == -1) {
            return text;
        } else {
            letters[positionX] = text;
            String xtext = new String(letters);
            return strings(xtext);
        }
    }
}


  //  public static String Strings(String x, char y) {
  //      int n = x.length();
  //      if (x.charAt(n) == y) {
  //          return String.copyValueOf(a) + x.substring(n - 1);
  //      } else {
  //          return x.charAt(n) + Strings(x, y);
  //      }
  //  }


//Given a string, compute recursively (no loops) a new string
// where all the lowercase 'x' chars have been changed to 'y' chars. CharAT