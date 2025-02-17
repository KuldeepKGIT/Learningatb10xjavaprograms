package practice;

public class constructor_with_para {
     constructor_with_para (int a){
        System.out.println(a);
    }
    void ns_method(){
        System.out.println("non-static method");
    }

    public static void main(String[] args) {
        System.out.println("Calling constructor");
        constructor_with_para a1 = new constructor_with_para(10);
                a1.ns_method();
    }
}
