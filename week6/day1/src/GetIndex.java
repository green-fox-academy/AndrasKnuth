import java.util.List;

public class GetIndex {

  public int getIndex(List<Integer> list, int value) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == value) {
        return i;
      }
    }
    return -1;
  }
}
