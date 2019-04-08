import java.util.stream.IntStream;

public class Sum {
    public static void main(String[] args){
        int b = 6;
        System.out.println(sum(b));
    }
    public static int sum(int a){
        int[] ia = new int[a];
        for (int i = 1; i < a; i++) {
            ia[i] = i;
        }
        int suma = 0;
        for (int e : ia) {
            suma += e;
        }
        return suma;
    }
}
// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
