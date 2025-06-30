package oops_concept.polymorphism.methodOverriding;

public class Lab_002 {
    public static void main(String[] args) {
        Son s = new Son();
        s.Owner();
        Father f = new Father();
        f.Owner();
        Father s1 = new Son(); //Dyanamic Dispatch
        s1.Owner(); //Method overridden
        s.car();
        f.fCar();
        s1.fCar();

    }
}
