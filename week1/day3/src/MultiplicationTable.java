import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Number please!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < 11; i++ ){
            for (int b = 1; b < 11; b++)
            {
            System.out.println(b + " * " + n + " = " + b * n);
            }
        }
    }
}