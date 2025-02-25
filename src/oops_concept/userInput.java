package oops_concept;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Brand/model Name");
        String model = scanner.next();
        System.out.println("Enter the manufacturing year");
        int year = scanner.nextInt();
        car2 C1 = new car2(model,year);
        C1.displayInfo();


    }



}
