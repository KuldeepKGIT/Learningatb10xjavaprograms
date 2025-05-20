package coding250;

import java.util.Scanner;

public class Lab0017_R {
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        if(number<=3){
            return true;
        }
        if(number%2==0 || number%3==0){
            return false;
        }
        for(int i=5; i*i<=number; i += 6){
            if(number%i==0||number%(i+2)==0){
                return false;
        }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number!");
        int number = scanner.nextInt();
        System.out.println("The number is a prime: "+isPrime(number));
    }
}
