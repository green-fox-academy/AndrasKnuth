import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number please");
        Integer n = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Number 2 please");
        Integer n1 = scanner1.nextInt();
        if (n>n1){
            System.out.println(n);
        }else if (n1>n){
            System.out.println(n1);
        }else{
            System.out.println("Those two are equals, you moron!");
        }
    }
}
