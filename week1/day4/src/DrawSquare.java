public class DrawSquare {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            if (i < 0 && i < a) {
                System.out.println("%    %");
            } else {
                System.out.println("%%%%%%%");
            }

        }
    }
}
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was