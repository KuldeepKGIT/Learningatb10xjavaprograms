package Task_31st_Jan;

import java.util.Scanner;

public class Palindromeprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number!");
        int input_number = scanner.nextInt();
        int x = 0;
        int temp = input_number;
        while(temp!=0)
        {
            x = x*10 + temp%10;
           temp = temp/10;
        }
        if(x==input_number)
        {
            System.out.println(input_number+" is a palindrome");
        }
        else System.out.println(input_number+ " is not a palindrome");
        scanner.close();
    }
}
