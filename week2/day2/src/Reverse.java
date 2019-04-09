

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String reverse = "";
        for(int i = reversed.length() - 1; i >= 0; i--)
        {
            reverse = reverse + reversed.charAt(i);
        }
        System.out.println(reverse);
    }
}