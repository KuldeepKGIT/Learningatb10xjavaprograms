package learningoperators_02;

public class Lab006_challenge01 {
    public static void main(String[] args) {
        String strnum = args[0];
        int a = Integer.parseInt(strnum);
        String grade = (a >= 90 && a <= 100) ? "A" :
                (a >= 80 && a <= 89) ? "B" :
                        (a >= 70 && a <= 79) ? "C" :
                                (a >= 60 && a <= 69) ? "D" : "F";
        System.out.println("Grade: " + grade);


    }
}
