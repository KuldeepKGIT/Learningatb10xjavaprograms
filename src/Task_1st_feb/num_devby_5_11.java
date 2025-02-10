package Task_1st_feb;

import java.util.Scanner;

public class num_devby_5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check divisibility by 5 & 11!");
        int num = scanner.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("Number is divisible by 5 & 11 both.");
        }
        else System.out.println("Number does not qualifies.");
        scanner.close();
    }
}
