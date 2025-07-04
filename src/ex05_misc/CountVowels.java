package ex05_misc;

import java.util.Arrays;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = scanner.nextLine().toLowerCase();
        System.out.println(Arrays.toString((countVowels(str))));

    }
    public static int[] countVowels(String str){
        int vCount = 0;
        int cCount = 0;
        char[] strArr = str.toCharArray();
        int[] arr = new int[2];
        for(char ch : strArr){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if (ch>='a'&& ch<='z') {
                cCount++;
            }
        }
        arr[0]=vCount;
        arr[1]=cCount;
        return arr;
    }
}
