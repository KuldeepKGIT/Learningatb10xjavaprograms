package ex_04_Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5}; //declaration and initialization of an array

        int [] revArray = new int [array.length];
        int index = 0;
        System.out.print("reversed array: ");
        for(int i = array.length-1; i>=0;i--){
            revArray[index++]= array[i];
        }
        System.out.println(Arrays.toString(revArray));
        System.out.println(revArray[revArray.length-1]);
    }
}
