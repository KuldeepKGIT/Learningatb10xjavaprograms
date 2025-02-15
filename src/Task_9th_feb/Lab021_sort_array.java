package Task_9th_feb;

import java.util.Arrays;

public class Lab021_sort_array {
    public static void main(String[] args) {
        int[] numbers = {12,34,10,1,100,3,4,32};
        Arrays.sort(numbers);
        System.out.println("Length of the Array "+numbers.length);
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
        for (int i=0; i<8; i++){
            System.out.println(numbers[i]);
        }

    }
}
