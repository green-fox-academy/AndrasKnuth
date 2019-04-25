import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    static Map characterCount(String inputString) {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return charCountMap;
    }
}

/*
Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
and numbers as values that shows how many occurrences there are.
Create a test for that.
 */