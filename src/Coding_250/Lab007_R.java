package Coding_250;

import java.util.Scanner;

public class Lab007_R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values of sides!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a==b && b==c){
            System.out.println("It is an equilateral Triangle");
        } else if (a==b || b==c || c==a) {
            System.out.println("It is an isosceles Triangle");

        }
        else System.out.println("It is a scalene Triangle");
        scanner.close();
    }
}
