package ex05_misc;

public class NoDuplicate {
    public static void main(String[] args) {
        String string = "Hello world";
        System.out.println(noDuplicate(string));
    }
    public static String noDuplicate(String str){
        char[] strArr = str.toCharArray();
        StringBuilder noDupStr = new StringBuilder();
        for(char ch: strArr){
            if(!noDupStr.toString().contains(String.valueOf(ch))){
                noDupStr.append(ch);
            }
        }
        return noDupStr.toString();
    }
}
