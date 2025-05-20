package coding250;

import java.util.Scanner;


public class Lab004_R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to check Palindrome possibility");
        String Word = scanner.nextLine();
        Word = Word.toLowerCase();
        boolean isPalindrome = true;
        int i =0;
        int j = Word.length()-1;
        while(i<j){
            if (Word.charAt(i) != Word.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
       if(isPalindrome){
           System.out.println(Word+ " is a palindrome");
       }
       else System.out.println(Word+" is not a palindrome");
    }
}
