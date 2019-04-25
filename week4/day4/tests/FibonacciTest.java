import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fibo;

    @Before
    public void setup() {
        fibo = new Fibonacci();
    }

    @Test
    public void fibonacciTest1() {
        assertEquals(8, fibo.fibonacci(6));
    }


}
