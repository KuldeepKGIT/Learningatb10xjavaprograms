package ex06;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "aabbccddkk";
        System.out.println(removeDup(s));
    }
    public static String removeDup(String s){
        char[] ArrS = s.toCharArray();
        StringBuilder noDup = new StringBuilder();
        for(int i=0; i<ArrS.length; i++){
            if(noDup.indexOf(String.valueOf(s.charAt(i)))==-1){
                noDup.append(s.charAt(i));
            }
        }
        return noDup.toString();
    }

}
