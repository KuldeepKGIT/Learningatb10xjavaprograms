package demo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {5, 2, 9, 1, 3};
        bubbleSort(num);
        for(int number : num){
            System.out.print(number+" ");
        }
    }
    public static void bubbleSort(int[] num){
        for(int i=0; i< num.length-1; i++){
            for(int j=0; j< num.length-1-i; j++){
                if(num[j]>num[j+1]){
                    int temp =num[j];
                    num[j] = num[j+1];
                     num[j+1]=temp;
                }
            }
        }
    }
}
