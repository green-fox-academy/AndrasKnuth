import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplesTest {
    Apples apples;

    @Before
    public void setup() {
        apples = new Apples();
    }

    @Test
    public void isEqualToApple(){
        assertEquals("apple", apples.getApple());
    }

    @Test
    public void isNotEqualToApple(){
        assertNotEquals("appl", apples.getApple());
    }



}

/*
Create a test class
Create a test method
Instantiate an Object from your class in the method
Use the assertEquals()
The expected parameter should be the same string (eg. "apple")
The actual parameter should be the return value of the method (eg. myObject.getApple())
Run the test
Change the expected value to make the test failing
Run the test
Fix the returned value to make the test succeeding again
 */