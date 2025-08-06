package ex06;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "vishal";
        System.out.println(sortString(str));
    }
    public static String sortString(String s){
        char[] arrStr = s.toCharArray();
        Arrays.sort(arrStr);
        return Arrays.toString(arrStr);
    }
}
