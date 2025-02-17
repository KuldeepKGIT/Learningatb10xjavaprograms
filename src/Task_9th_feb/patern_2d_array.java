package Task_9th_feb;

import java.util.Scanner;

public class patern_2d_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();
        for (int i=0; i<=rows; i++){
            for( int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
