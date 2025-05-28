package coding250.hashMap;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",1);
        map.put("Orange",2);
        map.put("Banana",3);
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
