package coding250;

public class Lab011_R {
    public static void main(String[] args) {
        int n= 5;
        for(int i=1; i<=n; i++){
            if(i>1){
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
            }
            for(int k=5; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
