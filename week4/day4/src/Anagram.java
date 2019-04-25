

import java.util.Arrays;

public class Anagram {

    static boolean areAnagram(String  s1, String  s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;


            return true;
    }
}

/*
Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
Create a test for that.
 */