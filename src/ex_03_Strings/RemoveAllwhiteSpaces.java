package ex_03_Strings;

public class RemoveAllwhiteSpaces {
    public static void main(String[] args) {
        String str = "  Geeks for Geeks  ";
        System.out.println("Before: "+str);
        str = str.replaceAll("\\s","");
        System.out.println("After: "+str);
    }
}
