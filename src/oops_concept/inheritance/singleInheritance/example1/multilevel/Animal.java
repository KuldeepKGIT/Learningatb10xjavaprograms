package oops_concept.inheritance.singleInheritance.example1.multilevel;

public class Animal {
    String name;
    Animal(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(name+" is eating");
    }
}
class Mammal extends Animal{
    boolean hasFur;
    Mammal(String name,boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }
    void showMammalFeature(){
        System.out.println("Has fur: "+hasFur);
    }

}
class Dog extends Mammal{
    String breed;
    Dog(String name,boolean hasFur,String breed){
        super(name, hasFur);
        this.breed=breed;
    }
    void bark(){
        System.out.println(name+" is barking");
    }
    void DisplayInfo(){
        System.out.println("Dog name: "+name);
        System.out.println("Breed: "+breed);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Hunter",false,"Labrador");
        d.DisplayInfo();
        d.eat();
        d.showMammalFeature();
        d.bark();

    }
}
