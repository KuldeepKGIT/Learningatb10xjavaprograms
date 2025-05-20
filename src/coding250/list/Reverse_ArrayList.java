package coding250.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_ArrayList {
    public static void main(String[] args) {
//        List fruits = List.of("Banana","Apple","Pineapple",1);
//        fruits.add("Mango");      //not possible
//        System.out.println(fruits);
//        System.out.println(fruits.reversed());
        List<Integer> list = new ArrayList<>();//dynamic dispatch
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(9);
        Collections.reverse(list);
        System.out.println("ReversedArrayList:" +list);
    }
}
