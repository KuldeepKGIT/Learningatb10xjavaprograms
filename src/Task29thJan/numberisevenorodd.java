package Task29thJan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class numberisevenorodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the number?");
        int i = scanner.nextInt();
        String result = (i%2==0 )?"Even Number":"Odd Number";
        System.out.println(result);
        scanner.close();
    }
}
