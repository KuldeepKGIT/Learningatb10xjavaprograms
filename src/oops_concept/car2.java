package oops_concept;

import java.time.Year;

public class car2 {
    String model;
    int year;
    car2(String model,int year){           //parameterized constructor
        this.model= model;
        this.year = year;
    }
    void displayInfo(){
        System.out.println("Brand: "+model);
        System.out.println("Year: "+ year);
    }

    public static void main(String[] args) {
        car2 myCar = new car2("Toyota", 2019);
        myCar.displayInfo();
    }
}
