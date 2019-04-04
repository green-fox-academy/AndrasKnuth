import java.util.Scanner;

public class MiletoKmConverter {
    public static void main(String[] args) {
        System.out.println("Would you be so kind dear Sir, to tell me how many Kilometers are left from our journey?");
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        Double miles = km * 0.621371192D;
        System.out.println("That is still exactly " + miles + "miles Sir!");
}
}