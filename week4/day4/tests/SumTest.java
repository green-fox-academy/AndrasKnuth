import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
    Sum sum;

    @Before
    public void setup() {
        sum = new Sum();
    }

    @Test
    public void emptyList(){
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(0, sum.sum(list));
    }

    @Test
    public void oneElement(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,3);
        assertEquals(3,sum.sum(list));
    }

    @Test
    public void multipleElement(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        assertEquals(9, sum.sum(list));
    }
}
