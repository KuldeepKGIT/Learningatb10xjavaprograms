package ex_02_java.Do_while;

import java.util.Scanner;

public class Lab_022_menuDriven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Exit!");
            System.out.println("Enter your Choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add two numbers");
                    int a, b;
                    System.out.println("Enter the number 1:");
                    a = scanner.nextInt();
                    System.out.println("Enter the number 2:");
                    b = scanner.nextInt();
                    int c = Math.addExact(a,b);
                    System.out.println("Result: " + c);
                    break;
                case 2:
                    System.out.println("Subtract two numbers");
                    System.out.println("Enter the number 1:");
                    a = scanner.nextInt();
                    System.out.println("Enter the number 2:");
                    b = scanner.nextInt();
                    c = Math.subtractExact(a,b);
                    System.out.println("result: " + c);

                    break;
                case 3:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
        while(choice!=3);


    }
}
