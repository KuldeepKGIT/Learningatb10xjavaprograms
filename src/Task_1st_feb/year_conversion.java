package Task_1st_feb;

import java.util.Scanner;

public class year_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a days count!");
        long days = scanner.nextLong();
        long years = days / 365;
        long rem_days = days%365;
        long months = rem_days/30;
        long left_days = rem_days%30;
        System.out.println(years+" Years, "+ months+ " Months, "+left_days+" Days");
        scanner.close();

    }
}
