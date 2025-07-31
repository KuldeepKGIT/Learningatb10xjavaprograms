package ex05_misc;

public class MiscString {
    public static void main(String[] args) {
        String s = "core java 113 for selenium 3302";
        System.out.println(rev(s));
    }
    public static String rev(String str){
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s");
        for(String word:words){
            if(word.matches("\\d+")){
                String reversed = new StringBuilder(word).reverse().toString();
                result.append(reversed);
            }
            else{
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

}
