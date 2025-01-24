package learningoperators_02;

public class Lab008_TO2 {
    public static void main(String[] args) {
        int x= -5,y= -7, z= -11;
        int largest_num = (x>=y)?((x>=z)?x:z):((y>=z)?y:z);
        System.out.println(largest_num);
    }
}
