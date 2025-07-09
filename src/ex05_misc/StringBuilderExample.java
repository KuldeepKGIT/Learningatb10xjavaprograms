package ex05_misc;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.insert(5, ",");
     sb.replace(0, 5, "Hi");
        sb.deleteCharAt(2);
        sb.reverse();

        System.out.println("Final String: " + sb.toString()); // Output: dlroW ,iH
    }
}

