package practice;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine().toLowerCase();
        System.out.println(revStr(str));
        if(str.equals(revStr(str))){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }

    }
    public static String revStr(String str){

        return new StringBuilder(str).reverse().toString();


    }
}
