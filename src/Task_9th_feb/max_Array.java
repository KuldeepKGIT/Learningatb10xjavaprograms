package Task_9th_feb;

import java.util.Arrays;

public class max_Array {
    public static void main(String[] args) {
     int[] array = {12,34,10,1,100,3,4,32};
        System.out.print("Initial Array: " + Arrays.toString(array));
        int temp = array[0];
        for (int j : array) {
            if (j > temp) {
                temp = j;
            }

        }
        System.out.print("\nmaximum value from array is ");
        System.out.print(temp);

}
}
