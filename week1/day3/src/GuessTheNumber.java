import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
    int guess;
    int number = 5;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("I am thinking of a number, what do you think it is?");
        guess = keyboard.nextInt();
        while (guess != number) {
        if (guess > number) {
            System.out.println("Lower!");
        }
        else {
            System.out.println("Higher!");
        }
    }
        System.out.println(number + "is the correct answer");
}
}
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8