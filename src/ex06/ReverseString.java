package ex06;

public class ReverseString {
    public static void main(String[] args) {
      String string = "Hi welcome";
        System.out.println(revString(string));
    }
    static String revString(String str) {
       String noSpace = str.replaceAll("\\s","");
       StringBuilder rev = new StringBuilder(noSpace).reverse();
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == ' ') {
                rev.insert(i,' ');
            }
        }
        return rev.toString().trim();
    }
}
