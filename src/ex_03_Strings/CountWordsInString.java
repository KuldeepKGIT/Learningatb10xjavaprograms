package ex_03_Strings;

public class CountWordsInString {
    public static void main(String[] args) {
        String s = new String("String");
        System.out.println(s.length());

        String sentence = "this String learning";
        String[] words = sentence.split("\\s");
        System.out.println("Number if words: "+words.length);
        for ( String word: words){
            System.out.println(word);
        }
    }
}
