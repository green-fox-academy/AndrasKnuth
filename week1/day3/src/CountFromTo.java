import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        System.out.println("Number 1. please!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Number 2. please");
        scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if ( a >= b ){
            System.out.println("The second number should be bigger!");
        }else if (a < b){
            for (int i=a; i<b-1; i++ ){
                System.out.println(a+i);
            }
        }
    }
}