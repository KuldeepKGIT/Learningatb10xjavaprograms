package practice;

import java.util.Arrays;

public class ReverseArray {
     static final int[] inputArr = new int[] {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        System.out.println("Input Array: "+ Arrays.toString(inputArr));
        System.out.println(Arrays.toString(reverseArr(inputArr)));



    }
    public static int[] reverseArr(int[] array){
        int[] newArr = new int[array.length];
        int index =0;
        for(int i= array.length-1; i>=0; i--){
            newArr[index++] =array[i];
        }
        return newArr;
    }
}
