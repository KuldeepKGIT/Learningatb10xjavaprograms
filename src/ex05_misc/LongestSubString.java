package ex05_misc;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
String string = "abcdeafgh";
LongestSubString longestSubString = new LongestSubString();
        System.out.println("Longest Sub-String without repeating characters: "+longestSubString.longestSubstringLength(string));
    }
    public int longestSubstringLength(String str){
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left =0;
        for(int right=0; right<str.length(); right++){
                while (set.contains(str.charAt(right))){
                    set.remove(str.charAt(left));
                    left++;
                }

            set.add(str.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
