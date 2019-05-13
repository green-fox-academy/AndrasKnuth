import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIndexTest {
  GetIndex getIndex;

  @Before
  public void setup() {
    getIndex = new GetIndex();
  }

  @Test
  public void getIndexTest() {
    int value = 0;
    List<Integer> list = new ArrayList<>();
    assertEquals(-1, getIndex.getIndex(list, value));
  }

  @Test
  public void getIndex() {
    int value = 92;
    List<Integer> list = Arrays.asList(91, 92, 93, 94, 94);
    assertEquals(1, getIndex.getIndex(list, value));
  }


}
