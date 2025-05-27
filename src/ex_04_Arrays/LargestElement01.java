package ex_04_Arrays;

public class LargestElement01 {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1}; // declaration and initialization
        int maxNUm = numbers[0];
        for (int num : numbers){
            if (maxNUm < num){
                maxNUm = num;
            }

        }
        System.out.println("Maximum number: "+ maxNUm);
    }
}
