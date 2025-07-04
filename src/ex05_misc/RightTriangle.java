package ex05_misc;

public class RightTriangle {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){  // loop for rows
            for(int j=1; j<=i; j++){  // loop for printing stars
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
