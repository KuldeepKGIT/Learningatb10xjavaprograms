package ex_02_java;

import java.util.Scanner;

public class Lab013_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age!");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote in elections");
        }
        else {
            System.out.println("Your are not eligible to vote");

        }

        sc.close();


    }
}
