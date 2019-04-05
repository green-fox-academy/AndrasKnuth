import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number=");
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i > 0 && i < n) {
                System.out.println("%     %");
            }
            else {
                System.out.println("%%%%%%%");
            }
        }
    }
}