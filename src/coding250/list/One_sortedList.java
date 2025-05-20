package coding250.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class One_sortedList {
    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5,7));
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,6,8));
//        ArrayList<Integer> MergedList = new ArrayList<>(list1);
//        MergedList.addAll(list2);
//        System.out.println("Merged List: "+ MergedList);
//        Collections.sort(MergedList);
//        System.out.println("Sorted List: "+ MergedList);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5,7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,6,8));
       List<Integer> MergedList = new ArrayList<>(list1);
       MergedList.addAll(list2);
        System.out.println("Merged List: "+ MergedList);
        Collections.sort(MergedList);
        System.out.println("Sorted List: "+ MergedList);

    }
}
