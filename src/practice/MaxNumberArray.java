package practice;

public class MaxNumberArray {
    public static void main(String[] args) {
        System.out.println(maxNumber(new int[] {4, 781, 8, 99, 103}));

    }
    public static int maxNumber(int[] array){
        int maxNum = array[0];
        for(int num : array){
            if(maxNum<num){
                maxNum = num;
            }
        }
        return maxNum;
    }
}
