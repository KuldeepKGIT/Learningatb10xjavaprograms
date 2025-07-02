package ex05_misc;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int[] arr = {7, 2, 10, 1, 8, 3, 5, 6, 4, 9};
       bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] array){
        int n = array.length-1;
        for(int i = 0; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;


                }
            }
        }
    }
}
