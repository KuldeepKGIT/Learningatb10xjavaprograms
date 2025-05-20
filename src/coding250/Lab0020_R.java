package coding250;

import java.util.Scanner;

public class Lab0020_R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str  = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("String: "+str);
        System.out.println("Reversed: "+reversed);
        if (str.equals(reversed)){
            System.out.println("It is a palindrome");
        }
        else System.out.println("It is not a palindrome");
    }
}
