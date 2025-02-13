package Task_7th_feb;

public class rev_pyramid {
    public static void main(String[] args) {
        int i;
        int x;
        int n = 5;
        System.out.println("Star pattern");
        for(i=1; i<=n; i++)
        {
            for(int k=4; k >= n-i; k--){
                System.out.print(" ");
            }
            for (x=9; x>=(2*i-1); x--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
}
}
