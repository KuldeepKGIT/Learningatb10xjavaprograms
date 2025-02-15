package Task_7th_feb;

import java.util.Scanner;

public class Checking_prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number!");
        int num = scanner.nextInt();
        int digit = 0;
        for (int i = 2; i <= num - 1; i++) {
             if (num%i==0) {
                 digit++;
             }
        }
        if (digit > 0) {
            System.out.println(num + " is not a prime number");
        }
        else System.out.println(num+" is a prime number");


    }
}
