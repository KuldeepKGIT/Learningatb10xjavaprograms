package practice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word!");
        String str = scanner.nextLine().toLowerCase();
        if(isPal(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }

    }
    public static boolean isPal(String string){
        int start = 0;
        int end = string.length()-1;
        while(start<end){
            if(string.charAt(start)!=string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
