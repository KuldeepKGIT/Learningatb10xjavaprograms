package coding250;

public class Lab012_R {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
