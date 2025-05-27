package ex_04_Arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements002 {
    public static void main(String[] args) {
        int[] numbers ={5, 3, 9, 1, 3, 7, 5, 2, 9, 1};
        Map<Integer,Integer> frequencyMap = new HashMap<>();
         for (int number : numbers){
             frequencyMap.put(number, frequencyMap.getOrDefault(number,0)+1);
         }
         for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet() ){
             System.out.println("Element: "+entry.getKey()+"\nFrequency: "+entry.getValue());
         }
    }
}
