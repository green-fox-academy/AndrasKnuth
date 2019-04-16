import java.util.Scanner;
public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Number please");
        Scanner scanner = new Scanner(System.in);
        Double divisor = scanner.nextDouble();

        try{
            Double result = divide(divisor);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero!");
        }

    }
    public static Double divide(Double x){
        return 10 / x;
    }
}
