package ex05_misc;

import java.util.Arrays;

public class RemoveOneElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 2, 8, 1, 9, 1};
        int n = arr1.length;
        int count = 0;
        for(int oneElement : arr1){
            if(oneElement==1){
                count++;
            }
        }
        int[] arr2 = new int[n-count];
        int j=0;
        for(int i=0; i<n; i++){
            if(arr1[i]!=1){
                arr2[j] =arr1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
