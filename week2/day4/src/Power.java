public class Power {
    public static void main(String[] args){
        System.out.println(Power(4, 2));
    }

    public static int Power(int n, int base){
        if (base <= 0) {
            return 0;
        } else {
            return n * n + Power(n , base - n);
        }
    }
}
//Given base and n that are both 1 or more, compute recursively
// (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).