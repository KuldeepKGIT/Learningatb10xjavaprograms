package ex_02_java;

import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scanner.nextLine().toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }

        scanner.close();
    }
}
