import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> ProductDatabase = new HashMap<>();
        ProductDatabase.put("Eggs", 200);
        ProductDatabase.put("Milk", 200);
        ProductDatabase.put("Fish", 400);
        ProductDatabase.put("Apples", 150);
        ProductDatabase.put("Bread", 50);
        ProductDatabase.put("Chicken", 550);
        System.out.println("Fish costs " + ProductDatabase.get("Fish"));
        int sum = 0;
        for (Map.Entry<String, Integer> entry : ProductDatabase.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("The average of prices is: " + sum/ProductDatabase.size());


        for (int x : ProductDatabase.values()) {
            if (ProductDatabase.values() < 300){

            }
        }

        System.out.println(ProductDatabase.containsValue(125));
        System.out.println(ProductDatabase.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());
        System.out.println(ProductDatabase.entrySet().stream().min((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());
    }
}
