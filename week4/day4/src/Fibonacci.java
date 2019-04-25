public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        System.out.println(fibo.fibonacci(6));
    }

    public int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}