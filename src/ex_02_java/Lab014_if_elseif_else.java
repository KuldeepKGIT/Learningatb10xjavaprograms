package ex_02_java;

import java.util.Scanner;

public class Lab014_if_elseif_else {
    public static void main(String[] args) {
        Scanner age =new Scanner(System.in);
        System.out.println(" Enter the age of the individual");
        int Age = age.nextInt();
        if (Age < 13){
            System.out.println("you're a child");
        } else if (Age >= 13 && Age < 19) {
            System.out.println(" you're a teenager");
            
        } else if (Age >= 19 && Age <=59) {
            System.out.println("you're an adult");
            
        }
        else{
            System.out.println(" you're a senior citizen");
        }

        age.close();
    }
}
