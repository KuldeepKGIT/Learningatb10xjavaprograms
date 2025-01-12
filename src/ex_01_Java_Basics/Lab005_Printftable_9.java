package ex_01_Java_Basics;

public class Lab005_Printftable_9 {
    public static void main(String[] args) {
        System.out.println("Table of Nine");

        for (int i = 1; i <= 10; i++) {
            int result = 9 * i;
            System.out.printf("9 X %d = %d\n", i, result);
        }
    }
}
