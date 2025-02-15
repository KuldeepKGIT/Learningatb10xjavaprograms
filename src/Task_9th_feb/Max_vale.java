package Task_9th_feb;

public class Max_vale {
    public static void main(String[] args) {
        int[] array = {15, 10, 14, 35, 17};
        System.out.println("Minimum number from the array");
        int min_element = min(array);
        System.out.print(min_element);
    }
    static int min(int[] array){
        int min_num = array[0];
        for(int i=0; i< array.length; i++){
            if(array[i]< min_num){
                min_num = array[i];
            }
        }
        return min_num;
    }
}
