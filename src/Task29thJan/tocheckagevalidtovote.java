package Task29thJan;

import java.util.Scanner;

public class tocheckagevalidtovote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the age!");
            int age = scanner.nextInt();
            if(age<=0){
                System.out.println("Invalid age, Enter a valid number");
            } else if (age<18)
            {
                System.out.println("You are not eligible to vote");
            }
            else{
                System.out.println("You are eligible to vote");
            }
        } catch (Exception e) {
            System.out.println("Enter a valid input, Enter a numeric value!");
        }
        scanner.close();
    }
}
