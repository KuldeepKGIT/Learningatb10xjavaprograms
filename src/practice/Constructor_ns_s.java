package practice;

public class Constructor_ns_s {
    Constructor_ns_s(int a, int b){
        int sum = a+b;
        System.out.println("Sum: "+sum);
    }
    static void add(int i, int j){
        int Add_up = i+j;
        System.out.println("Add up of two numbers "+Add_up);

    }
    void sub(){
        System.out.println("this is non-static method");
    }
    public static void main(String[] args) {
        System.out.println("practicing constructor with parameter along with static and non-static method");
        new Constructor_ns_s(5,10);
        Constructor_ns_s a2 = new Constructor_ns_s(6,8);
        add(3,4);
        a2.sub();

    }
}
