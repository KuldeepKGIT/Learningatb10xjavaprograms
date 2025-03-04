package ex_03_Strings;

public class StringImmutabilityTest {
    public static void main(String[] args) {
        String str = "Hello"; //initialization and declaration of String
        str.concat(" World!");
//        System.out.println(str.contains("p"));
        System.out.println(str);

        System.out.println("-------------------------------------");

        StringBuilder stringS = new StringBuilder("uni");
        stringS.append("verse");
        System.out.println(stringS);

        System.out.println("-------------------------------------");
        String s1 = new String("Kuldeep");
        s1= s1.concat(" Kumar");
        System.out.println(s1);




    }
}
