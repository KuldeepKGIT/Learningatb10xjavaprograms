package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        System.out.println("Enter the String!");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arrStr = str.toCharArray();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(Character ch : arrStr){
            if(frequencyMap.containsKey(ch)){
                frequencyMap.put(ch, frequencyMap.get(ch)+1);
            }
            else {
                frequencyMap.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.print(""+entry.getKey()+entry.getValue());
        }
    }
}
