package Task_7th_feb;

public class pyramid_with_6_rows {
    public static void main(String[] args) {
        int n = 6;
        for ( int i = 1; i <= n; i++){
            for ( int j=1; j <= n-i; j++ ){
                System.out.print("  ");
            }
            for (int k=1; k<=(2*i-1); k++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
