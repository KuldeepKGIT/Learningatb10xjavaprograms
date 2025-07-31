package ex06;

public class ReverseString01 {
    public static void main(String[] args) {
      String s = "Hi Welcome";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(String word: words){
            StringBuilder reversed = new StringBuilder(word).reverse();
            str.append(reversed).append(" ");
        }
        return str.toString().trim();
    }
}
