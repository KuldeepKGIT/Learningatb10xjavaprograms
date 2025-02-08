package ex_02_java;

import java.util.Scanner;

public class lab0019_whileloop_revdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int num = scanner.nextInt();
        int rev = 0;
        int ognum = num;

        while(num != 0){
            int digit = num%10;
            rev = rev*10 +digit;
            num =num/10;
        }
        System.out.println("The reverse digits of the number "+ognum+ " is " + rev);
        scanner.close();
    }
}
