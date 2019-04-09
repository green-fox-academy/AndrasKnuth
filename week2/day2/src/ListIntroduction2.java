import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args){
        List<String> ListA = Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee");
        List<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);

        System.out.println(ListA.contains("Lychee"));
        System.out.println(ListA);
        ListB.remove("Durian");

        System.out.println(ListA);
        if (ListA.size() > ListB.size()){
            System.out.println("ListA is longer");
        }else{
            System.out.println("ListB is longer");
        }
        ListA.indexOf("Avocado");
        ListB.indexOf("Durian");
        List<String> ListC = Arrays.asList("PAssion Fruit", "Pummelo");
        ListB.addAll(ListC);
        System.out.println(ListA.get(3));
    }
}
