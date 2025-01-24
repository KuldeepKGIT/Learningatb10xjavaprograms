package learningoperators_02;

public class Lab010_IDtask02 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--); // expression 1 value will be 19
        // expression 2 value will be 19 but value of a become 20 again
        // expression 3 value will be used 20 but after that value of a become 19
        System.out.println(a);


    }
}
