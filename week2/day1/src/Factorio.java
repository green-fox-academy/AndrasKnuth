public class Factorio {
    public static void main(String[] args){
        int s = 5;
        System.out.println(factorio(s));
    }
    public static int factorio(int a){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++) {
            fact = fact * i;
        }
        return fact;
    }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial