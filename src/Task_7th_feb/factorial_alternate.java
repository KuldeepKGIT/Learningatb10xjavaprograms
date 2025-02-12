package Task_7th_feb;

import java.util.Scanner;

public class factorial_alternate {
    public static long factorial(int n){
        if (n==0 || n== 1){
            return 1;
        }
        else {
            return n* factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number!");
        int n = scanner.nextInt();
        if (n<0){
            System.out.println("Enter a positive number!");
        }
        else {
            long result = factorial(n);
            System.out.println("Factorial of number "+n+ " is "+result);
        }
        scanner.close();
    }

}
