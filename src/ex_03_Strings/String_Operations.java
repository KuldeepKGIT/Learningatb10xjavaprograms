package ex_03_Strings;

public class String_Operations {
    public static void main(String[] args) {
        String s ="Hello Word!";

        s.concat(" it's me here...");
        System.out.println(s.length());

        String s1 = new String("Kuldeep");
        s1.concat("Kumar");
        System.out.println(s1.length());
        StringBuilder s2 = new StringBuilder("this is");
        s2.append(" Java");
        System.out.println(s2.length());
        System.out.println(s2);
        System.out.println(s2.length());
    }
}
