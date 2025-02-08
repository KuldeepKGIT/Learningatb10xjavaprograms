package Task_30th_Jan;

import java.util.Scanner;

public class tovalidatetypetriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the sides");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a==b && b==c ){
            System.out.println("It is an Equilateral Triangle");
        } else if (a==b  || a==c || b==c) {
            System.out.println(" it is an Isosceles Triangle");
        }
        else if (a+b>c && b+c>a && a+c>b)
        {
            System.out.println("It is an Scalene Triangle");
        }
        else System.out.println("It is not a Triangle");
        scanner.close();
    }
}
