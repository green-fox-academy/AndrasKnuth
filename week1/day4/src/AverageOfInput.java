import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number please");
        Integer n = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Number 2 please");
        Integer n1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Number 3 please");
        Integer n2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Number 4 please");
        Integer n3 = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Number 5 please");
        Integer n4 = scanner4.nextInt();
        System.out.println("Sum: " + (n+n1+n2+n3+n4) + "Average: " + ((n+n1+n2+n3+n4)/5));
    }
}