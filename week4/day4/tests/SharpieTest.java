import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SharpieTest {
    Sharpie sharpie;

    @Before
    public void setup(){
        sharpie = new Sharpie("Pink", 50);
        sharpie.setInkAmount(50);
    }

    @Test
    public void useTest(){
        sharpie.setInkAmount(50);
        sharpie.use();
        assertEquals(49, sharpie.getInkAmount(), 0.1);

    }

    @Test
    public void getColorTest(){
        assertEquals("Pink", sharpie.getColor());
    }

    @Test
    public void setColorTest(){
        sharpie.setColor("Red");
        assertEquals("Red", sharpie.getColor());
    }

    @Test
    public void getWidthTest(){
        assertEquals(50, sharpie.getWidth(), 0.1);
    }

    @Test
    public void setWidthTest(){
        sharpie.setWidth(55);
        assertEquals(55, sharpie.getWidth(), 0.0);
    }

    @Test
    public void setInkAmount(){
        sharpie.setInkAmount(50);
        assertEquals(50, sharpie.getInkAmount(), 0.0);
    }

    @Test
    public void getInkAmount(){
        sharpie.setInkAmount(55);
        assertEquals(55, sharpie.getInkAmount(), 0.0);
    }


}
