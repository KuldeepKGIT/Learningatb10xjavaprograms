package ex_04_Arrays;

import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> Duplicate = new HashSet<>();
        for(int number : numbers){
            if(!seen.add(number)){
                Duplicate.add(number);
            }
        }
        System.out.println("Duplicate Elements: "+ Duplicate);


    }
}
