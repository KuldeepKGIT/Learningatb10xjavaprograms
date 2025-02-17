package Task_9th_feb;

public class Array_2d {
    public static void main(String[] args) {
        int [][] arr_2d = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i=0; i<arr_2d.length; i++){
            for(int j=0; j<arr_2d[i].length; j++){
                System.out.print(arr_2d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
