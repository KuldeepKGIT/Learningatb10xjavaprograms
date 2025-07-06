package ex05_misc;

public class ReverseString {
    public static String reverse(String str){
      String noSpace = str.replaceAll("\\s","");
      StringBuilder revStr = new StringBuilder(noSpace).reverse();
      for(int i=0; i<str.length(); i++){
          if(str.charAt(i)==' '){
              revStr.insert(i,' ');
          }
      }
        return revStr.toString();
    }
    public static void main(String[] args) {
        String str = "My Name is john doe";
        System.out.println("reverse is: "+reverse(str));
    }
}
