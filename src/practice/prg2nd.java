package practice;

import java.util.Scanner;

public class prg2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value!");
        int i = scanner.nextInt();
        /*if (i/2==0){
            System.out.println("Even value");
        }
        else {
            System.out.println("Odd value");
        }*/
        String result = (i/2==0)? "Even Value" : "Odd value";
        System.out.println("Result "+ result);
    }
}
