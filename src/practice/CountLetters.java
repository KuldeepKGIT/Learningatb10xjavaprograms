package practice;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println(countLetters("aauuchhh"));
    }

    public static Map<Character,Integer> countLetters(String Str){
        Map<Character,Integer> count = new HashMap<>();
        char[] strArr = Str.toCharArray();
        for(Character ch : strArr){
            count.put(ch,count.getOrDefault(ch,0)+1);
        }
        return count;
    }
}
