package ex05_misc;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int num : numbers){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }
}
