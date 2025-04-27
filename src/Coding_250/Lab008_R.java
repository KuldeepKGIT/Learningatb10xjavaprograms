package Coding_250;

public class Lab008_R {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){ //Loop for Rows
            for(int j= 1; j<=i; j++){ //Loop for Star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
