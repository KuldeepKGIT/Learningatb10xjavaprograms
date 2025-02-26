package oops_concept.inheritance.singleInheritance.example1;

public class person {
    String name;
    int age;
    public person(String name,int age){
        this.name= name;
        this.age= age;
    }
    void displayInfo(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}
