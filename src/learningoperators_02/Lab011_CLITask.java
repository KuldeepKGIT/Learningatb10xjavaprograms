package learningoperators_02;

public class Lab011_CLITask {
    public static void main(String[] args) {
        String first_name = args[0];
        String last_name = args[1];
        String b = args[2];
        int age = Integer.parseInt(b);
        String c =args[3];
        int salary = Integer.parseInt(c);
        System.out.println("Name- "+first_name +" "+ last_name +"\nAge-"+ age +"\nSalary- " +salary);
    }
}
