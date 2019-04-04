import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Dear Sir, my I have Your name?");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Welcome at our humble house, Mr/Mrs/Ms " + userInput1 + "!");
    }
}