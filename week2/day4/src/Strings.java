public class Strings {
    public static void main(String[] args) {
        System.out.println(Strings("elmegyek a boltba", 'e', 'a'));
    }

    public static String Strings(String s, char from, char to) {
        StringBuffer result = new StringBuffer(s.length());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == from) {
                result.append(to);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
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