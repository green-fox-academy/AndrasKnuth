import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        System.out.println("Would you be so kind dear Sir, to write me a number of your choice?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Thats not good enough!");
        } else if (number == 1) {
            System.out.println("That is just one!");
        } else if (number == 2) {
            System.out.println("Thats a pair!");
        } else if (number > 2) {
            System.out.println("Thats a lot!");
        }
    }
}