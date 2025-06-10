package practice;

public class Swap {
    public static void main(String[] args) {
        int i = 10;
        int j = 15;
        j = j - i;
        i = i + j; // i = 15 now
        j = i - j; // j = 10;
        System.out.println("i: "+ i);
        System.out.println("j: "+ j);



    }
}
