package Task_7th_feb;

import java.util.Scanner;

public class factorial_x {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the value");
       int i = scanner.nextInt();
        int result=1;
        int x=1;
        while (x <= i) {
            result = result * x;
            x++;

        }
        System.out.println(result);


    }
}
