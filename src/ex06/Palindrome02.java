package ex06;

import java.util.Scanner;

public class Palindrome02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = scanner.nextInt();
        palindromeCheck(num);
    }
    public static void palindromeCheck(int num){
        int original = num;
        int temp =0;
        while(num!=0){
            int rem = num%10;
            temp = temp*10+rem;
            num = num/10;
        }
        if(original==temp){
            System.out.println(original+" number is a palindrome");
        }
        else {
            System.out.println(original+" number is not a palindrome");
        }
    }
}
