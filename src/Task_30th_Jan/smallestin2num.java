package Task_30th_Jan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class smallestin2num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the value of two numbers!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int maxnum = Math.min(a,b);
        System.out.println("Smallest number is "+ maxnum);
    scanner.close();
    }
}
