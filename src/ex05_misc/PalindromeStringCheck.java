package ex05_misc;

import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = scanner.nextLine().toLowerCase();
        StringBuilder revStr = new StringBuilder(str).reverse();
        System.out.println("reverse String: "+ revStr);
        if(str.contentEquals(revStr)){
            System.out.println(str+": it is a palindrome");
        }
        else{
            System.out.println(str+": it is not a palindrome");
        }
    }

}
