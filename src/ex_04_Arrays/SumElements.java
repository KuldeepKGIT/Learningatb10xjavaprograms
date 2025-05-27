package ex_04_Arrays;

public class SumElements {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10};
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        System.out.println("Sum of the elements: "+sum);
    }
}
