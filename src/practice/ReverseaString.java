package practice;

public class ReverseaString {
    public static void main(String[] args) {
    String input = "I Am Not String";
    String noSpace = input.replace(" ","");
    StringBuilder revStr = new StringBuilder(noSpace).reverse();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == ' '){
                revStr.insert(i,' ');
            }
        }
        System.out.println("Output: "+revStr);
    }
}
