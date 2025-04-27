package Coding_250;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab002_R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input!");
        int N = scanner.nextInt();
        for(int i = 1; i<=10;i++){
            int Result = N * i;
            /*Format Key	Meaning	Example
%d	Integer	System.out.printf("%d", 25); → 25
%f	Floating-point number	System.out.printf("%.2f", 5.678); → 5.68
%s	String	System.out.printf("%s", "Hello");
%c	Character	System.out.printf("%c", 'A');
%b	Boolean	System.out.printf("%b", true);
%n	New line (like \n)	System.out.printf("Line1%nLine2");
%%	Prints a literal percent sign	System.out.printf("50%%"); → 50% */
            //System.out.println(N + " X "+i+ " = "+ Result);
            System.out.printf("%d X %d = %d %n",N,i,Result);
        }
    }
}
