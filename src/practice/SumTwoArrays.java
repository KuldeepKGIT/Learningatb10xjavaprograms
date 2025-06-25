package practice;


import java.util.Arrays;


import java.util.LinkedHashSet;
import java.util.Set;

public class SumTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {7,-5,3,8,-4,11,-19,21};
        int[] arr2 = {6,13,-7,0,-4, 3,-5};

        Set<Integer> set = new LinkedHashSet<>();
        for(int num1 : arr1){
         set.add(num1);
        }
        for(int num2 : arr2){
            set.add(num2);
        }
        Integer[] arr3 = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr3));




    }
}
