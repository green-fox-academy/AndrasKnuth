import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> sl = Arrays.asList("eggs", "chichken", "milk", "fish", "apples");

        System.out.println(sl.contains("milk"));
        System.out.println(sl.contains("bananas"));
    }
}




/*
We are going to represent a shopping list in a list containing strings.

Create a list with the following items.
Eggs, milk, fish, apples, bread and chicken
Create an application which solves the following problems.
Do we have milk on the list?
Do we have bananas on the list?
 */