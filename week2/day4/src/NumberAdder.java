public class NumberAdder {
    public static void main(String[] args) {
        int a = 5;
        numberAdder(a);
    }

    public static int numberAdder(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n + numberAdder( n - 1);
        }
    }
}



