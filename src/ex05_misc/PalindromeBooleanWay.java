package ex05_misc;

import java.util.Scanner;

public class PalindromeBooleanWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String string = scanner.nextLine().toLowerCase();
        if (palindromeCheck(string)) {
            System.out.println(string+": is a palindrome");
        }
        else {
            System.out.println(string+": is not a palindrome");
        }
    }
    public static boolean palindromeCheck(String str){
        int n = str.length();
        for(int i=0; i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
