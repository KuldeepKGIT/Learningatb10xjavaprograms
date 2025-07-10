package ex05_misc;

import java.util.Arrays;

public class AnagramCheck01 {
    public static void main(String[] args) {
        String[] strings = {"listen", "silent", "enlist", "inlets"};
        boolean allAnagram = true;
        for(int i=1; i<strings.length; i++){
            if(!areAnagram(strings[0],strings[i])){
                allAnagram = false;
                break;
            }
        }
        if(allAnagram){
            System.out.println("All strings are Anagram of each other");
        }
        else{
            System.out.println("Strings are not Anagram of each other");
        }
    }
    public static boolean areAnagram(String s1, String s2){
        if(s1.length()!=s2.length())  return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
