package ex05_misc;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        if (!scanner.hasNextInt()) {
            System.out.println(" Invalid input! Please enter a number.");
            return;
        }
        int marks = scanner.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100.");
            return;
        }
        char grade;
        if(marks>=90 ){
            grade = 'A';
        }
        else if (marks>=80) {
            grade = 'B';
        } else if (marks>=70) {
            grade ='C';
        } else if (marks>=60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is: "+ grade);
        scanner.close();
    }

}
