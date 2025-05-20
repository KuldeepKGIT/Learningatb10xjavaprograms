package coding250;

public class Lab009_R {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--){ //iterations loop for inner loop to print Star
            for(int j= 1; j<=i; j++){ //Loop for Star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
