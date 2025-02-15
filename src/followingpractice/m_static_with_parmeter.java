package followingpractice;

public class m_static_with_parmeter {
    public static void add(int n){
        int q =10;
        int c = q + n;
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("calling static modifier");
        add(10);
    }

}

