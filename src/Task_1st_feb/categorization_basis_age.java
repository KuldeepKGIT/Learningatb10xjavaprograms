package Task_1st_feb;

import java.util.Scanner;

public class categorization_basis_age {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the age of the person!");
        int age = scanner.nextInt();
        if (age>=0 && age<=12){
            System.out.println("person is a child");
        } else if (age>12 && age<=19) {
            System.out.println("person is a Teenager");
        }
        else if (age>19 && age<=64) {
            System.out.println("person is an adult");
        }
        else System.out.println("person is a senior citizen");
    }
}
