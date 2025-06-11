package practice;

public class NoDupChar {
    public static String noDup(String str){
        char[] strChArr = str.toCharArray();
        StringBuilder noDupStr = new StringBuilder();
        for(char ch : strChArr){
            if(!noDupStr.toString().contains(String.valueOf(ch))){
                noDupStr.append(ch);
            }
        }
        return noDupStr.toString();
    }
}
