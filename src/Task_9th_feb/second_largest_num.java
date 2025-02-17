package Task_9th_feb;

import java.util.Arrays;

public class second_largest_num {
    public static void main(String[] args) {
        int[] arr = {12,34,10,1,100,3,4,32};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }
}
