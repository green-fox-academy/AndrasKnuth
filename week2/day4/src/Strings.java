public class Strings {
    public static void main(String[] args) {
        System.out.println(Strings("elmegyek a boltba", 'e', 'a'));
    }

    public static String Strings(String s, char from, char to) {
        if (s.length() < 1) {
            return s;
        }
        else {
            char first = from == s.charAt(0) ? to : s.charAt(0);
            return first + Strings(s.substring(1), from, to);
        }
    }
    }


//Given a string, compute recursively (no loops) a new string
//public static String Strings(String x, char y){
 //   int n = x.length();
   // String a = "a";
   // if (x.charAt(n) == y) {
     //   return String.copyValueOf(a) + x.substring(n-1);
  //  } else {
   //     return x.charAt(n) + Strings(x, y);
   // }
//}
// where all the lowercase 'x' chars have been changed to 'y' chars. CharAT