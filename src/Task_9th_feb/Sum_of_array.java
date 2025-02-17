package Task_9th_feb;

public class Sum_of_array {
    public static void main(String[] args) {
        int[] arr = {12,34,10,1,100,3,4,32};
        int sum = 0;
        System.out.print("array: ");
        for(int j : arr){
            System.out.print(j+" ");
        }
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("\nSum: "+sum);

    }
}
