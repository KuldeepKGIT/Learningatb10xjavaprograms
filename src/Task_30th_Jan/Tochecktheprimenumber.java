package Task_30th_Jan;

import java.util.Scanner;

public class Tochecktheprimenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        int count=0;
        for (int i= 2; i<=n-1; i++)
        {
            if(n%i==0){
                count++
                ;
            }
        }
        if (count>0){
            System.out.println(n+ " is not a prime number");
        }
        else {
            System.out.println(n+ " is a prime number");
        }
        scanner.close();

    }
}
