public class GreatestCommonDivisor {
    public static void main(String[] args){
        System.out.println(Divisor(12, 15));
    }
    public static Integer Divisor(int x, int y){
        {
            if ( y == 0 ) {
                return x;
            }
            else if ( x >= y && y > 0) {
                return Divisor(y, x % y);
            }
            else {
                return Divisor ( y , x );        // if x < y then go ahead and switch them around.
            }
        }
    }
}
