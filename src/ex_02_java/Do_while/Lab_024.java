package ex_02_java.Do_while;

import java.util.Scanner;

public class Lab_024 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner( System.in);
        System.out.println("Enter the Number!");
        int num = scanner.nextInt();
        int sum = 0;

        do{
            int i = num%10;
            sum = sum+i;
            num = num/10;
        }
        while (num !=0);
        System.out.println("Sum: "+sum);
        scanner.close();
    }
}
