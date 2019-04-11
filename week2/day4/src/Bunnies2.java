public class Bunnies2 {
    public static void main(String[] args){
        System.out.println(Bunnies(6));
    }
    public static int Bunnies(int x){
        if ( x == 0){
            return 0;
        }else if (x % 2 == 0){
            return 3 + Bunnies(x-1);
        }else {
            return 2 + Bunnies(x-1);
        }
    }
}
//We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
// Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).