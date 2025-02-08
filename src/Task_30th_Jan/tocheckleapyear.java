package Task_30th_Jan;

import java.util.Scanner;

public class tocheckleapyear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Enter the Year!");
        int year = scanner.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0){
            System.out.println(year+" is a leap year!");
        }
        else{
            System.out.println(year+" is not a leap year!");
        }

            } catch (Exception e) {
            System.out.println("INVALID INPUT!");
        }
        scanner.close();

    }
}
