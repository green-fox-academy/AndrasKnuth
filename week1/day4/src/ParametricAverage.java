import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] Args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Number please!");
        int a = keyboard.nextInt();
        for (int i = 0; i < a; i++){
            int arra[] = new int [a];
            arra[0] = a;
            Scanner keyboard1 = new Scanner(System.in);
            System.out.println("Number please!");
            int n = keyboard1.nextInt();
            arra[0+1] =n;
            System.out.println(arra);
        }
    }




}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4