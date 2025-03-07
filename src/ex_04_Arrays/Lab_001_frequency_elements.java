package ex_04_Arrays;

import java.util.HashMap;
import java.util.Map;

public class Lab_001_frequency_elements {
    public static void main(String[] args) {
        int[] num_Array = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        HashMap<Integer,Integer> FrequencyMap = new HashMap<>();
        for(int num : num_Array){
            FrequencyMap.put(num,FrequencyMap.getOrDefault(num,0)+1);
        }
        System.out.println(FrequencyMap);
        for(Map.Entry<Integer,Integer> entry : FrequencyMap.entrySet()){
            System.out.println("Element: "+entry.getKey()+ "  Frequency: "+entry.getValue());
        }
    }
}
