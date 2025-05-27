package ex_04_Arrays;

public class RemoveOneElement {
    public static void main(String[] args) {
        int [] array = {1, 5, 2, 8, 1, 9, 1}; //initialization/declaration of array
        int valueToRemove = 1;
        int count = 0;
        for (int k : array){
            if(k==valueToRemove){
                count++;
            }
        }
        int [] newArray = new int[array.length-count];
        int index = 0;
        for(int num : array){
            if(num!=valueToRemove){
                newArray[index++]=num;
            }
        }
        System.out.print("New array without 1s: ");
        for(int j : newArray){
            System.out.print(j +" ");
        }
    }
}
