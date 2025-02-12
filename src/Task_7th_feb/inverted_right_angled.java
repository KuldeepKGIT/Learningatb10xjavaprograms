package Task_7th_feb;

public class inverted_right_angled {
    public static void main(String[] args) {
        int i;
        int x;
        int n = 5;
        System.out.println("Star pattern");
        for(i=1; i<=n; i++)
        {
            for (x=5; x>=i; x--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
