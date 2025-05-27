package ex_03_Strings;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = scanner.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }

    }
}
