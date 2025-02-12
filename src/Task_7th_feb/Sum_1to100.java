package Task_7th_feb;

public class Sum_1to100 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
//        while(i<=100){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("Sum: "+ sum);
        for (i=1; i<=100; i++){
            sum = sum + i;
        }
        System.out.println("Sum: "+sum);
    }
}
