package ex_02_java;
import java.util.Scanner;

public class Palindrome_charAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = scanner.nextLine().toLowerCase();//to convert the string into lower case
        boolean isPalindrome = true;
        int length = str.length();
        for(int i = 0; i<length/2; i++){
            if (str.charAt(i)!=str.charAt(length-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("String is palindrome");
        }
        else System.out.println("String is not palindrome");
        scanner.close();
    }
}
