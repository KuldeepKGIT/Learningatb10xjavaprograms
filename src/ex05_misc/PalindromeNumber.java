package ex05_misc;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = scanner.nextInt();
        if(num<0){
            System.out.println("negative numbers are not allowed!");
            return;
        }
        int temp = 0;
        int dup = num;
        while(num!=0){
            int rem = num%10;
            temp = 10*temp+rem;
            num /= 10;

        }
        if(temp==dup){
            System.out.println(dup+": is a palindrome");
        }
        else {
            System.out.println((dup+": is not a palindrome"));
        }
    }
}
