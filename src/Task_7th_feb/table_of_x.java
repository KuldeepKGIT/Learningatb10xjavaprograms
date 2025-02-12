package Task_7th_feb;

import java.util.Scanner;

public class table_of_x {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter the number!");
        int i = scanner.nextInt();
        int j = 1;
        while(j<=10){
            int result = i * j;
            System.out.println(i +" * "+ j+ " = "+result);
            j++;
        }
    }
}
