package oops_concept;

public class Constructor_overloading {
    Constructor_overloading( ){
        System.out.println("calling non parametrized constructor");
    }
    Constructor_overloading(int a, int b){
        int Sum = a + b;
        System.out.println("Sum: "+Sum);
    }
    Constructor_overloading(String a){
        this();
        System.out.println(" Passing a string: " +a);
    }

    public static void main(String[] args) {
        new Constructor_overloading(4,3);
        new Constructor_overloading("Kuldeep" );
    }
}
