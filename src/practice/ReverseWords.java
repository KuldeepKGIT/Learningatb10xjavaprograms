package practice;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(revString("I am John Doe"));

    }
    public static String revString(String str){
       StringBuilder res = new StringBuilder();
       String[] words = str.split(" ");
       for(int i= words.length-1; i>=0; i--){
           res.append(words[i]).append(" ");
       }
       return res.toString().trim();
    }
}
