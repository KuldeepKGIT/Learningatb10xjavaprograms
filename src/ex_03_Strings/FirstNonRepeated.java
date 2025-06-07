package ex_03_Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "aabbcddeff";
        Map<Character,Integer> map = new HashMap<>();
        char[] strArray = str.toCharArray();
        for(Character ch : strArray){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non-Repeated character is: "+ entry.getKey());
                break;
            }
        }
    }
}
