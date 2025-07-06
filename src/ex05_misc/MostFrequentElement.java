package ex05_misc;

import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4));
        System.out.println(frequencyMap(list));



    }
public static Map<Integer,Integer> frequencyMap(List<Integer> list){
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer num : list) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        return map;
}
}
