package coding250;

import java.util.Scanner;

public class Lab0016_R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word!");
        String str = scanner.nextLine().toLowerCase();
        int VCount = 0;
        int CCount = 0;
        for (int i=0; i<=str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                VCount++;
            }
            else CCount++;
        }
        System.out.println("Vowel count is: "+VCount);
        System.out.println("Consonant count is: "+CCount);
        scanner.close();
    }
}
