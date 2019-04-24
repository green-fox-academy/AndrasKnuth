package CharSequence;

public class Gnirts implements CharSequence {
    String text;

    public void Gnirts(String text){
        this.text = text;
    }
    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return null;
    }


    public static void main(String[] args) {
        Gnirts g = new Gnirts();
        g.text = "String";


        System.out.println(g.charAt(2));
        System.out.println(g.length());
        System.out.println(g.subSequence(1,2));
    }
}
