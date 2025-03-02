package ex_02_java.Do_while;

import java.util.Scanner;

public class Lab_021_positive_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a positive number!");
            n = scanner.nextInt();

            if (n<0){
                System.out.println("invalid input");
            }
        }
        while(n>0);

scanner.close();

    }
}
