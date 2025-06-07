package practice;

import java.util.Scanner;

public class ReverseString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String!");
        String string = scanner.nextLine();
        System.out.println(revString(string));

    }
    public static String revString(String str){
        StringBuilder res = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}
