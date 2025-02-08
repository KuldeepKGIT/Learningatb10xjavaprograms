package ex_02_java;

import java.util.Scanner;

public class Lab0018_whileloop2_sumofn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range!");
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n)
        {
             sum += i;
             i++;
        }
        System.out.println("Sum of n natural numbers="+ sum);
    }
}
