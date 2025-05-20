package coding250;

import java.util.Scanner;

public class lab0019R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = scanner.nextLine().toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else System.out.println(str + " is not a palindrome");
        scanner.close();
    }
}
