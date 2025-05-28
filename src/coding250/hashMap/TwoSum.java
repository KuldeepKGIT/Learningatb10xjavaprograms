package coding250.hashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {11, 15, 2, 7};
        int target = 9;
        int[] result = twoSum(numbers,target);
        if(result!=null){
            System.out.println("indices: "+result[0]+","+result[1]);
        }
        else {
            System.out.println("there are no such two numbers which add up to the target");
        }

    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< numbers.length; i++){
            int complement = target - numbers[i];
            if(map.containsKey(complement)){ //checking if the complement presents in the Map or not
                return new int[]{map.get(complement),i}; //Storing the indices in the new array
            }
            map.put(numbers[i], i);
        }

        return null;
    }

}
