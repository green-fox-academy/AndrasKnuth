import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("William");
        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.get(2));
        for (String name : names){
            System.out.println(name);
        }
        Collections.reverse(names);
        for (String reversed : names){
            System.out.println(reversed);
        }
        names.remove(1);
        for (int i = 0; i < names.size(); i++){
            System.out.println(i + "." + names.get(i));
        }
        names.clear();
    }
}
