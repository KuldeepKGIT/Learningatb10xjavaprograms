package ex06;

import java.util.Scanner;

public class Palindrome01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to check");
        String str = scanner.nextLine();
        System.out.println(str+" is palindrome = " +palindromeCheck(str));
    }
    public static boolean palindromeCheck(String str){
        boolean isPalindrome = true;
        String reverse = new StringBuilder(str.toLowerCase()).reverse().toString();
        if (!str.equals(reverse)) {

            isPalindrome = false;

        }
        return isPalindrome;
    }
}
