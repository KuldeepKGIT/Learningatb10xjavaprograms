package ex_03_Strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = new String(" Geeks for Geeks ");
        str = str.replaceAll("\\s","");
        str = str.trim();
        System.out.println(str);
    }
}
