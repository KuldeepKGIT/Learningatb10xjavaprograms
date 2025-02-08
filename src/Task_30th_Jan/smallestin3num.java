package Task_30th_Jan;

import java.util.Scanner;

public class smallestin3num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the value of numbers!");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int small_num = (a <= b) ? ((a <= c) ? a : c) : ((b <= c) ? b : c);
            System.out.println("Print the smallest number " + small_num);
        } catch (Exception e) {
            System.out.println("invalid input");
        }
        scanner.close();
    }
}
