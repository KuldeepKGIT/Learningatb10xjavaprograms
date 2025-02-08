package Task29thJan;

import java.util.Scanner;

public class numberispostiveornegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int i = scanner.nextInt();
        String result = (i<0)?"Negative Number":"Positive Number";
        System.out.println("Result " +result);
    }
}
