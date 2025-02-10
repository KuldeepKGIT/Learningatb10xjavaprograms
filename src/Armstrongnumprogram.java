import java.util.Scanner;

public class Armstrongnumprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to check if it is an armstrong");
        Double num = scanner.nextDouble();
        int unit = 0;
        double temp = num;
        int numdigits = String.valueOf(num).length();
       while (temp!=0)
        {
            double x = temp%10;
           unit += (int) Math.pow(x,numdigits);
           temp = temp/10;
        }
       if (unit==num){
           System.out.println(num+"  is an armstrong number!");
       }
       else System.out.println(num+"  is not an armstrong number!");
       scanner.close();
    }
}
