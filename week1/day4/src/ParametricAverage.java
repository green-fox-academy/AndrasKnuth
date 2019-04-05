import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] Args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Number please!");
        int a = keyboard.nextInt();
        int[] arra = new int[a];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            arra[i] = keyboard.nextInt();
            System.out.println("One more number please!");
        }
        
    }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4