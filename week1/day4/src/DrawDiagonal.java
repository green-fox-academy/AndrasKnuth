public class DrawDiagonal {
    public static void main(String[] Args) {
        int rows = 10, k = 0;
        for (int i = 1; i <= rows; i++, k = 0) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("% ");
                k++;
            }
            System.out.println();
        }
    }
}



// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was