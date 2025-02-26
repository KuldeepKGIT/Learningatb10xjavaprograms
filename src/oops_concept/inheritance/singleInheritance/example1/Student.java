package oops_concept.inheritance.singleInheritance.example1;

public class Student extends person{
    int studentId;
    String course;
    Student( String name, int age,int studentId,String course){
        super(name, age);
        this.studentId=studentId;
        this.course=course;
    }
    void displayStudentInfo(){
        displayInfo();
        System.out.println("Student ID: "+studentId+"\nCourse: "+course);
    }

    public static void main(String[] args) {
        Student s = new Student("Kuldeep",27,5127937, "Computer science");
        s.displayStudentInfo();



    }
}
