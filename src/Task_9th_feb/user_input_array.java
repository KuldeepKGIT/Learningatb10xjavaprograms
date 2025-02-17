package Task_9th_feb;

import java.util.Arrays;
import java.util.Scanner;

public class user_input_array {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the length of the Array!");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the values for array!");
        for(int i=0; i<length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<length; i++){
            System.out.print(arr[i]);
        }

    }
}
