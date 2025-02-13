package Task_7th_feb;

public class pyramid_Star {
    public static void main(String[] args) {
        int i;
        int x;
        int n = 5;
        System.out.println("Star pattern");
        for(i=1; i<=n; i++)
        {
            for(int k=1; k <= n-i; k++){
                System.out.print(" ");
            }
            for (x=1; x<=(2*i-1); x++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
