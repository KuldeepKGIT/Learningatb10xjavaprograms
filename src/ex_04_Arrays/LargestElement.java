package ex_04_Arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Largest Element: "+numbers[numbers.length-1]);
    }
}
