package ex_03_Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = scanner.nextLine().toLowerCase();  // getting string as input from the user
        boolean isPalindrome = true;
        for (int i=0; i<str.length()/2; i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i))
            isPalindrome = false;
        break;
        }
        if(isPalindrome){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
