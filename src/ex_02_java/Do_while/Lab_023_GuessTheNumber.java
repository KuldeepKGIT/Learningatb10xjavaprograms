package ex_02_java.Do_while;

import java.util.Random;
import java.util.Scanner;

public class Lab_023_GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        int user_num;
        do{
            System.out.println("Enter the user input");
            user_num = scanner.nextInt();
            if(user_num<number){
                System.out.println("Too low try again!");
            }
            else if(user_num>number){
                System.out.println("Too High try again!");
            }
            else
            System.out.println("full match");

        }
        while(user_num!=number);
        scanner.close();
    }
}
