package practice;

import java.util.Arrays;

public class TwoStringAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));

    }
    public static boolean isAnagram(String str, String str1){
        char[] arr = str.toCharArray();

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
    }
}
