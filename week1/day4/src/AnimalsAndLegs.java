import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        Integer chicken = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How many pigs do you have?");
        Integer pigs = scanner2.nextInt();
        System.out.println(chicken*2 + pigs*4);


        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}