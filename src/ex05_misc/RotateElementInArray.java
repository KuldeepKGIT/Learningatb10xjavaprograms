package ex05_misc;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // {4,5,6,7,8,9,1,2,3};
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=3; i<arr.length; i++){
            arr1.add(arr[i]);
        }
        for(int i=0;i<arr.length-6;i++){
            arr1.add(arr[i]);
        }
        System.out.println(Arrays.toString(arr1.toArray()));

    }
}
