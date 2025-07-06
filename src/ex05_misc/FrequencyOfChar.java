package ex05_misc;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aabbccc";
        Map<Character,Integer> frequencymap = new HashMap<>();
        char[] strArr = str.toCharArray();
        for(char ch : strArr){
            if(frequencymap.containsKey(ch)){
                frequencymap.put(ch,frequencymap.get(ch)+1);
            }
            else {
                frequencymap.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry : frequencymap.entrySet()){
            System.out.print(""+entry.getKey()+entry.getValue());
        }
    }
}
