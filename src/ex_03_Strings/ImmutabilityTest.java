package ex_03_Strings;

public class ImmutabilityTest {
    public static void main(String[] args) {
        String str = "Kuldeep";
        str.concat(" Kumar"); // trying to update the string
        System.out.println(str); // output is still Kuldeep
    }
}
