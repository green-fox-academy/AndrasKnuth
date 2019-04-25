import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilTest {
    MathUtil mathUtil;

    @Before
    public void setup() {
        mathUtil = new MathUtil();
    }

    @Test
    public void addShouldAddTwoNumbersCorrectly() {
        assertEquals(5, mathUtil.add(2, 3));
    }

    @Test
    public void addShouldNotAddTwoNumbersCorrectly() {
        assertNotEquals(5, mathUtil.add(2, 2));
    }

    @Test
    public void addShouldGetTheMaxValueInt() {
        assertEquals(2147483647, mathUtil.add(Integer.MAX_VALUE - 1, 1));
    }

    @Test
    public void addShouldGetTheMaxValueIntPlusOne() {
        assertEquals(-2147483648, mathUtil.add(Integer.MAX_VALUE, 1));
    }

    @Test
    public void subtractShouldSubtractTwoNumbersCorrectly() {
        assertEquals(5, mathUtil.subtract(8, 3));
    }

    //And so on...
}
