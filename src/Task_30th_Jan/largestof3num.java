package Task_30th_Jan;

import java.math.BigInteger;
import java.util.Scanner;

public class largestof3num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the value of first number");
            BigInteger a = scanner.nextBigInteger();
            System.out.println("Enter the value of second number");
            BigInteger b = scanner.nextBigInteger();
            System.out.println("Enter the value of third number");
            BigInteger c = scanner.nextBigInteger();
            BigInteger result = a.max(b).max(c);
            System.out.println("Maximum value is " + result);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
