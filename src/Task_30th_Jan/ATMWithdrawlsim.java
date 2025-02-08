package Task_30th_Jan;

import java.util.Scanner;

public class ATMWithdrawlsim {
    public static void main(String[] args) {
        int acc_balance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the amount to be withdrawn!");
        int Withdrawl = scanner.nextInt();
        if (Withdrawl%100==0 && Withdrawl<= acc_balance){
            acc_balance = acc_balance - Withdrawl;
            System.out.println(Withdrawl+" Withdrawal successful \nBalance "+acc_balance );
        }
else if (Withdrawl > acc_balance){

            System.out.println("you have insufficient account balance \n Balance "+acc_balance);
        }
else {
            System.out.println("Enter the amount in denomination of 100");
        }
    }
}
