package Coding_250;

import java.util.Scanner;

public class Lab001_R {
    public static void main(String[] args) {
        //Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);
        //Prompt for user input
        System.out.print("Enter your name!");
        String name = scanner.nextLine();
        //Prompt for input age
        System.out.print("Enter your age!");
        int age = scanner.nextInt();
        System.out.println("Hello! "+name+" You are "+age+" years old.");
        scanner.close();

    }
}
