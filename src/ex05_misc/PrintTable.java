package ex05_misc;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print table!");
        int n = scanner.nextInt();
        for(int i=1; i<=10; i++){
            int result = n*i;
            System.out.printf("%d X %d = %d",n,i, result);
            System.out.println();
        }
    }
}
