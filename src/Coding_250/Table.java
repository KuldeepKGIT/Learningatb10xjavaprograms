package Coding_250;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the input");
        int n = scanner.nextInt();
        System.out.println("Table of input number");
        for(int i= 1; i<=10; i++){
            int result = n*i;
//            System.out.printf(n+" X "+i+ " = "+result);


            System.out.printf("%d X %d = %d\n",n,i,result);

        }
    }
}
