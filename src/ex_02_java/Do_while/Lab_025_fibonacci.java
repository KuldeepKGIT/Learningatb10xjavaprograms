package ex_02_java.Do_while;

import java.util.Scanner;

public class Lab_025_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for series up to !");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        int count =0;
        int next;
        do {
            System.out.print(first);
            if (count<n-1){
                System.out.print(", ");
            }
            next = first+second;
            first = second;
            second = next;
            count++;
        }
        while(count<n);
            scanner.close();
    }
}
