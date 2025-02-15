package Task_9th_feb;

import java.util.Arrays;

public class Sort_without_function {
        public static void main(String[] args) {
            int[] numbers = {12,34,10,1,100,3,4,32};
            int temp;
            System.out.println("Length of the Array " + numbers.length);
            for (int i = 0; i < numbers.length; i++) {          // traverse through each element
                for (int j = i+1; j < numbers.length; j++) {    // to compare with other elements
                    if (numbers[j] < numbers[i]) {
                        temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            System.out.print("sorted array: ");
            for (int number : numbers) {
                System.out.print(number+" ");
            }

        }
    }

