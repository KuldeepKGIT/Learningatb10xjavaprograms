package practice;

public class non_static_method {
    public void add(){
        int a =10;
        int b =20;
        int c =a+b;
        System.out.println("Sum of two number: "+c);
    }

    public static void main(String[] args) {
        System.out.println("Calling non static modifier");
        non_static_method a1 = new non_static_method();
        a1.add();
    }
}
