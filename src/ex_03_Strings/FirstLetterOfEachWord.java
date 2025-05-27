package ex_03_Strings;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        StringBuilder firstLetters = new StringBuilder();
        for(String word: str.split("\\s+")){
            firstLetters.append(word.charAt(0)).append(" ");
        }
        System.out.println(firstLetters);
    }
}
