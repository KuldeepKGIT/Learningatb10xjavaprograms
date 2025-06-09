package practice;

import java.util.Arrays;

public class ReverseArray01 {
    public static void main(String[] args) {
        int[] array = new int[] {8, 9, 5, 7, 3};
        System.out.println("reversed: "+ Arrays.toString(revStr(array)));
        for(int num: array){
            System.out.print(num+", ");
        }

    }
    public static int[] revStr(int[] array){
        // two pointers approach, one point will start from the beginning and other from the last
        int start = 0;
        int end = array.length-1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}
