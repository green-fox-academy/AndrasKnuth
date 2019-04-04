import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("How many girls came to the party?");
        Scanner scanner = new Scanner(System.in);
        int girls = scanner.nextInt();

        System.out.println("How many guys came to the party?");
        Scanner scanner2 = new Scanner(System.in);
        int guys = scanner2.nextInt();

        if (guys+girls > 20 && guys == girls){
            System.out.println("The party is excellent!");
        }else if (guys+girls >20 && guys != girls){
            System.out.println("Quite cool party!");
        }else if (girls < 1){
            System.out.println("Sausage party!");
        }
        else if (guys+girls < 20){
            System.out.println("Average party!");
        }
    }
}
