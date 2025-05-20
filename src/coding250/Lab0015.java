package coding250;

public class Lab0015 {
    public static void main(String[] args) {
        int n = 6;
        for (int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
           for(int k=9; k>=(2*i-1);k--
           ){
               System.out.print("*");
           }
            System.out.println();
        }
    }

}
