import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int[] array = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(unique(array));

    }
    public static int[] unique(int[] arr){
        Arrays.sort(arr);

        return arr;
    }


}
//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
// System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`