package Task_30th_Jan;

import java.util.Scanner;

public class gradesystemmethod {
    public static String grade(int marks) {
        if(marks>=90 && marks<=100) return "A";
        else if (marks>=80) return "B";
        else if (marks>=70) return "C";
        else if (marks>=60) return "D";
        else return "F (fail)";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the makrs!");
            int marks = scanner.nextInt();
            if (marks<0 || marks > 100){
                System.out.println("Invalid input!");
            }
            else
                System.out.println("Grade: "+grade(marks));
            } catch (Exception e) {
            System.out.println("Invalid Input! Enter a numeric value");
        }
scanner.close();
    }
}
