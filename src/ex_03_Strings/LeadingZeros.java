package ex_03_Strings;

public class LeadingZeros {
    public static void main(String[] args) {
        String str = "00012345";
        str = str.replaceFirst("^0+","");
        System.out.println(str);
    }
}
