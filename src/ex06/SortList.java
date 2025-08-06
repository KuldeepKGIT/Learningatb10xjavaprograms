package ex06;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        int[] array = {-4, 3, -9, 0, 4, 1};
        System.out.println(sortList(array));
    }
    public static List sortList(int[] array){
        List<Integer> list = new ArrayList<>();
        for(int num: array){
            list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}
