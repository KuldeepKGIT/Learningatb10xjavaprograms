package learningoperators_02;

public class Lab007_task2TO {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 9;
        int largest_number = (a>=b)?((a>=c)?a:c):((b>=c)?b:c);
        System.out.println(largest_number);
    }
}
