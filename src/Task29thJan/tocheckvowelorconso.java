package Task29thJan;

import java.util.Scanner;
public class tocheckvowelorconso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word");
        char ch = scanner.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }


    }
}
