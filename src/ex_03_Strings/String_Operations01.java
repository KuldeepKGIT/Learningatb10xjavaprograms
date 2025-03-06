package ex_03_Strings;

public class String_Operations01 {
    public static void main(String[] args) {
        String S = "Kuldeep";
        System.out.println(S.charAt(0));
        System.out.println(S.concat(" Kumar"));
        System.out.println(S);
        System.out.println(S.toLowerCase().contains("ku"));
        System.out.println(S.equals("Kuldeep"));
        System.out.println(S.equalsIgnoreCase("kuldeep"));
    }


}
