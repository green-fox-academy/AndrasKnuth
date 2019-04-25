import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTestLOL {
    Animal animal = new Animal(50,50);

    @Before
    public void setup(){
        animal = new Animal(50,50);
    }

    @Test
    public void eatTest(){
        assertEquals(49, animal.eat());
    }

    @Test
    public void drinkTest(){
        assertEquals(49, animal.drink());
    }

    @Test
    public void playTest(){
        animal.play();
        assertEquals(51, animal.getHunger());
        assertEquals(51, animal.getThirst());
    }
}
