package ex05_misc;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listed";
        System.out.println("result: "+areAnagram(s1,s2));

    }
    public static boolean areAnagram(String s1, String s2){
        boolean isAnagram = false;
        char[] strS1 = s1.toCharArray();
        char[] strS2 = s2.toCharArray();
        Arrays.sort(strS1);
        Arrays.sort(strS2);
        if(Arrays.equals(strS1, strS2)){
            isAnagram = true;
        }
        return isAnagram;
    }
}
