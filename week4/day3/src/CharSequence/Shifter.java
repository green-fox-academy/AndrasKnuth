package CharSequence;

public class Shifter implements CharSequence {
    String s;
    int number;

    Shifter(String s, int number) {
        this.s = s;
        this.number = number;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override

    public char charAt(int index) {

        if (index>number)
            return s.charAt (index);
        else {
            return s.charAt (number-index);
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return null;
    }

    public static void main(String[] args) {
        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
    }
}
