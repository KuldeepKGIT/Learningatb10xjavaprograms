package practice;

import java.util.Arrays;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] numbers = {11, 15, 2, 7};
        int target = 9;
        System.out.println(Arrays.toString(sumOfTwo(numbers,target)));

    }
    public static int[] sumOfTwo(int[] array, int target){
            int[] sumOfNumbers = new int[2];
            for(int i=0; i<array.length; i++){
                for(int j=1; j<array.length; j++){
                    if(array[i]+array[j]==target){
                        sumOfNumbers[0]=array[i];
                        sumOfNumbers[1]=array[j];
                        return sumOfNumbers;
                    }
                }
            }
            return new int[0];
    }
}
