
import java.util.HashMap;

public class ProductDatabase2 {
    
    public static void main(String[] args) {
        HashMap<String, Integer> ProductDatabase2 = new HashMap<>();
        ProductDatabase2.put("Eggs", 200);
        ProductDatabase2.put("Milk", 200);
        ProductDatabase2.put("Fish", 400);
        ProductDatabase2.put("Apples", 150);
        ProductDatabase2.put("Bread", 50);
        ProductDatabase2.put("Chicken", 550);
        for (String i : ProductDatabase2.keySet()) {
            if (ProductDatabase2.get(i).intValue() < 201) {
                System.out.println(i);
            }
        }
        for (String i : ProductDatabase2.keySet()) {
            if (ProductDatabase2.get(i).intValue() > 150) {
                System.out.println(i + " " + ProductDatabase2.get(i));
            }
        }
    }
}
/*
Create an application which solves the following problems.
Which products cost less than 201? (just the name)
Which products cost more than 150? (name + price)
 */