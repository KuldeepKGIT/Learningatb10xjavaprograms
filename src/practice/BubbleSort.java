package practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
int[] array = {5, 2, 9, 1, 3};
        bubbleSort(array);
        for(int num: array){
            System.out.print(num+" ");
        }
    }
    public static void bubbleSort(int[] array){
        int n = array.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


    }
}
