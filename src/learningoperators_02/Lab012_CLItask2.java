package learningoperators_02;

public class Lab012_CLItask2 {
    public static void main(String[] args) {
String a = args[0];
String b= args[1];
int x =Integer.parseInt(a);
int y= Integer.parseInt(b);
int bigger_number = (x>=y)?x:y;
        System.out.println(bigger_number);
    }
}
