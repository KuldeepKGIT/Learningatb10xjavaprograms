package ex_04_Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3};
        BubbleSort(array);
        System.out.print("Sorted array: ");
        for(int num : array){
            System.out.print(num+" ");
        }


    }
    public static void BubbleSort(int[] array){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            //Last i element is already sorted.
            for(int j=0;j<n-1-i;j++){
                //swap if the current element is greater than the next one
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }

    }
}
