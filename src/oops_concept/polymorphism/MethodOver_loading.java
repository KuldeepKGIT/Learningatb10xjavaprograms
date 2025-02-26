package oops_concept.polymorphism;

public class MethodOver_loading {
    public static void main(String[] args) {
        Math_operations m =new Math_operations();
        m.add();
        int r = m.add(5,10);
        System.out.println(r);
        int r1= m.add(2,2,2);
        System.out.println(r1);
    }
}
