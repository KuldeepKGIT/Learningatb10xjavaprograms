package ex05_misc;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        boolean isPrime = num > 1;
        for(int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num+": is a prime number");
        }
        else {
            System.out.println(num+": is not a prime number");
        }

    }

}
