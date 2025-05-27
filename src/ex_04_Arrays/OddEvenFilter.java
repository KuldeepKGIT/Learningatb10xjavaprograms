package ex_04_Arrays;

public class OddEvenFilter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.print("Even Numbers: ");
        for(int num : numbers){
            if(num%2==0){
                System.out.print(num+", ");
            }
        }
        System.out.print("\nOdd Numbers: ");
        for(int num : numbers){
            if(num%2!=0){
                System.out.print(num+", ");
            }
        }

    }
}
