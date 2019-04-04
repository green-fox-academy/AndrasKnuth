import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Would you be so kind dear Sir, to write me a number of your choice?");
        Scanner scanner = new Scanner(System.in);
        int anInt = scanner.nextInt();
        if (anInt % 2 == 0){
            System.out.println("This number is a beautiful even number, dear Sir!");
        }else {
            System.out.println("Aww man, this number is odd!");
        }



        // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
    }
}
