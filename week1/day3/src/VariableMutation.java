public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a + 10);
        int b = 100;
        System.out.println(b - 7);
        int c = 44;
        System.out.println(c * 2);
        int d = 125;
        System.out.println(d / 5);
        int e = 8;
        System.out.println(e * e);
        int f1 = 123;
        int f2 = 345;
        if (f1 > f2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        int g1 = 350;
        int g2 = 200;
        if (g2 * 2 > g1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        int h = 135798745;
        if (h % 11 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        int i1 = 10;
        int i2 = 3;
        if ((i2 * i2) > i1 && i1 > (i2 * 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        int j = 1521;
        if (j%3==0 &&j%5==00){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
