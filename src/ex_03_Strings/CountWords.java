package ex_03_Strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello world! Welcome to Java.";
        String[] words = str.split("\\s");
        System.out.println("number of words: "+words.length);
    }
}
