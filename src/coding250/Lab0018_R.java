package coding250;

public class Lab0018_R {
    public int[] countVowelsCons(String str) {
        int vCount = 0;
        int cCount = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if((ch >= 'a' && ch <= 'z')) {
                cCount++;
            }
        }

        return new int[]{vCount, cCount};
    }

    public static void main(String[] args) {
        Lab0018_R result = new Lab0018_R();
        // 👇 Capture the returned array
        int[] output = result.countVowelsCons("pious");

        // 👇 Print the values
        System.out.println("Vowels: " + output[0]);
        System.out.println("Consonants: " + output[1]);
    }
}
