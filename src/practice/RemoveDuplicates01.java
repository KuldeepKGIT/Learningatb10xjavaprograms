package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates01 {
    public static void main(String[] args) {
        System.out.println(removeDup("hello"));
        System.out.println(NoDupChar.noDup("Krrish"));
    }
    public static String removeDup(String str){
        char[] strArray = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder noDupStr = new StringBuilder();
        for(char ch: strArray){
            set.add(ch);
        }
        for(char ch1 :set){
            noDupStr.append(ch1);
        }
        return noDupStr.toString();
    }
}
