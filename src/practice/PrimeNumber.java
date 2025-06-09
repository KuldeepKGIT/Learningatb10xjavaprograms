package practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number!");
        int num = scanner.nextInt();
        System.out.println("Number is prime : "+ primeNumCheck(num));

    }
    public static boolean primeNumCheck(int num){
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
