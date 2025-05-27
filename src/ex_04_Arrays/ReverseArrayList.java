package ex_04_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 9, 1, 3, 7, 5, 2, 9, 1));
        Collections.reverse(arrayList);
        System.out.println("Reversed: "+arrayList);
    }


}
