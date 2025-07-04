package ex05_misc;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year!");
        if(!scanner.hasNextInt()){
            System.out.println("kindly enter a valid year");
            return;
        }

        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if(year%4==0 && year%100 !=0 || year%400==0){
            isLeapYear = true;
        }
        if (isLeapYear){
            System.out.println(year+": is a leap year");
        }
        else {
            System.out.println(year+": is not a leap year");
        }
    }
}
