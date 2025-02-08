package Task29thJan;

import java.util.Scanner;

public class maxof2numbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = Math.max(a,b);
        System.out.println("Maximum number is ->" + result);
        scanner.close();

    }

}
