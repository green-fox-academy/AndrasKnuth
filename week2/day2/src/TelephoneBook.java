import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, Integer> TelephoneBook = new HashMap<>();
        TelephoneBook.put("William A. Lathan",405-709-1865);
        TelephoneBook.put("John K. Miller",402-247-8568);
        TelephoneBook.put("Hortensia E. Foster",606-481-6467);
        TelephoneBook.put("Amanda D. Newland",319-243-5613);
        TelephoneBook.put("Brooke P. Askew",307-687-2982);
        System.out.println(TelephoneBook.get("John K. Miller"));
        System.out.println(TelephoneBook.containsKey("Chris E. Myers"));
        for (int i = 0; i < TelephoneBook.size(); i++)
            if (TelephoneBook.get(i).equals(307-687-2982)){
                System.out.println(TelephoneBook.get(i));
            }
    }
}
