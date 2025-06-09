package practice;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number!");
        int num = scanner.nextInt();
        palindromeCheck(num);

    }
    public static void palindromeCheck(int number){
        int temp = 0;
        int temp1 = number;
        int rem;
        while(number !=0){
            rem = number%10;
            temp =(temp*10)+rem;
            number = number/10;
        }
        if(temp == temp1){
            System.out.println(temp1+" is a palindrome number");
        }
        else {
            System.out.println(temp1+" is not a palindrome number");
        }
    }
}
