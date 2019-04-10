public class MathRandom {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < 1; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }
    }
}