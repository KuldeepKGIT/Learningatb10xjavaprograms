package ex_04_Arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int [] array = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        Map<Integer,Integer> frequencyMap = new HashMap<>();
         for (int number : array){
             if (frequencyMap.containsKey(number)){
                 frequencyMap.put(number,frequencyMap.get(number)+1);
             }else{
                 frequencyMap.put(number,1);
             }
         }
         for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
             System.out.println("number "+entry.getKey()+" Occurred "+entry.getValue()+" times.");
         }
    }

}
