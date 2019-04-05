import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = 5;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I am thinking of a number, what do you think it is?");
        int guess = keyboard.nextInt();
        while (guess != number){
            if (guess > number) {
                Scanner lower = new Scanner(System.in);
                System.out.println("Lower, another guess?");
                guess = lower.nextInt();
            }
            else {
                Scanner higher = new Scanner(System.in);
                System.out.println("Higher, another guess?");
                guess = higher.nextInt();
            }
        }
        System.out.println(number + " is the correct answer");
    }
}
