import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        int n = 5;
        System.out.println("Please guess a number!");
        System.out.println("Now type the number please!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (n > a){
            System.out.println("The stored number is higher");
        }else if (n < a){
            System.out.println("The stored number is lower");
        }else {
            System.out.println("The number is" + a + "!");
        }
    }
}
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8