package ex_02_java;

public class Lab015_fizbuzz {
    public static void main(String[] args) {
 int n =1;
 for (n=1; n<=100; n++)
 {
     if (n%3==0 && n%5==0){
     System.out.println("fizzbuzz");
 }
     else if (n%3==0){
         System.out.println("fizz");
     } else if (n%5==0) {
         System.out.println("buzz");
     }

     else
     System.out.println(n);
 }
    }
}
