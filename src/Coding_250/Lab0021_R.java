package Coding_250;

import java.util.Scanner;

public class Lab0021_R {
    //Fibonacci series problem
    //need to print fibonacci series' nth value on console
    //1 = 0 + 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value of n!");
        int n = scanner.nextInt();
        int n0 = 0;
        int n1= 1;
        int count = 2;
        int fib_value = 0;
        while(count <= n){
            fib_value = n0+n1;
            n0 = n1;
            n1 = fib_value;

            if(count==n){
                System.out.println("Value of nth term of the series: "+fib_value);
                break;
            }
            count++;
        }
        scanner.close();
    }

}
