package Coding_250;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab005_R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks Obtained!");
        int marks = scanner.nextInt();
        char Grade;
        if(marks>90 && marks<=100){
           Grade = 'A';
        } else if (marks>80 && marks<=90) {
           Grade ='B';
        }
        else if (marks>70 && marks<=80) {
            Grade ='C';
        }
        else if (marks>60 && marks<=70) {
            Grade ='D';
        }
        else if (marks>50 && marks<=60) {
            Grade ='E';
        }
        else Grade = 'F';
        System.out.println("Your Grade is : " + Grade);
        scanner.close();
    }
}
