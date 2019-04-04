import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){
        System.out.println("Number please!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=1; i<n+1; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}