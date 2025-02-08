package ex_02_java;

import java.util.Scanner;

public class lab020_whileloop_countdigits {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number!");
        int number = scanner.nextInt();
        int count = 0;
        int Number =number;
        while(number!=0)
        {
            number = number/10;
            count++ ;
        }
        System.out.println("the number of digits in the number " +Number+ " is " + count );
        scanner.close();
    }
}
