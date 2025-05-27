package ex_04_Arrays;

import java.util.HashSet;

public class DuplicateElements01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        HashSet seen = new HashSet<>();
        HashSet duplicate = new HashSet<>();
        for(int number : numbers){
            if(!seen.add(number)){
                duplicate.add(number);
            }
        }
        System.out.println("Duplicate Elements: "+duplicate);
        System.out.println("array: "+ seen);
    }
}
