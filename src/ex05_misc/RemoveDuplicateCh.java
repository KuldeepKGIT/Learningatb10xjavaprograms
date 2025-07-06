package ex05_misc;

public class RemoveDuplicateCh {
    public static void main(String[] args) {
        String str = "Hello world";
        StringBuilder noDup = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(noDup.indexOf(String.valueOf(str.charAt(i)))==-1){
                noDup.append(str.charAt(i));
            }
        }
        System.out.println(noDup);
    }
}
