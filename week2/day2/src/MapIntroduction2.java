import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(978-1-60309-452-8, "A Letter to Jo");
        map.put(978-1-60309-459-7, "Lupus");
        map.put(978-1-60309-444-3,"Red Panda and Moon Bear");
        map.put(978-1-60309-461-0, "The Lab");
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
//Lupus (ISBN: 978-1-60309-459-7)
//Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//The Lab (ISBN: 978-1-60309-461-0)
// map.remove(978-1-60309-444-3);

        map.remove("The Lab");
        map.put(978-1-60309-450-4, "They Calles Us Enemy");
        map.put(978-1-60309-453-5, "Why Did We Trust Him?");
        System.out.println(map.containsKey(478-0-61159-424-8));
        System.out.println(map.get(978-1-60309-453-5));
    }
}
