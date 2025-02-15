package Task_9th_feb;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {12,34,10,1,100,3,4,32};
        Arrays.sort(arr);
        System.out.println("print the sorted array: " + Arrays.toString(arr));
        System.out.print("Reversed array: ");
        for (int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
