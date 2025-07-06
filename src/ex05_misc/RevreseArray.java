package ex05_misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RevreseArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        List<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        System.out.println(list1);
        Collections.sort(list);
        List<Integer> mergedList = new LinkedList<>(list);
        mergedList.addAll(list1);
        System.out.println(mergedList);
        Collections.reverse(mergedList);
        System.out.println("Reverse List: "+mergedList);
    }
}
