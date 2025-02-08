package Task_30th_Jan;

import java.util.Scanner;

public class Alphabetchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the Input!");
            char ch = scanner.next().charAt(0);
            if ((ch >= 'a' && ch <= 'b') || (ch >= 'A' && ch <= 'Z'))
            {
                System.out.println(ch +" is an Alphabet");
            }
            else {
                System.out.println(ch+ " is not an Alphabet");
            }
        } catch (Exception e) {
            System.out.println(" Enter a valid input");
        }
        scanner.close();
    }
}
