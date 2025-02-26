package oops_concept.abstraction;
abstract class Facebook{
    abstract void Login();
    abstract void logout();

}
abstract  class Google extends Facebook{
    abstract void Search();
    static void result(){
        System.out.println("this Concrete method");
    }

}

public class Zoom extends Google {
    static void result1()
    {
        System.out.println("concrete method of concrete class");
    }
    void statement(){
        System.out.println("non static concrete method");
    }

    void Search() {
        System.out.println("enter the keyword to search");
    }

    void Login() {
        System.out.println("Username: \nPassword: ");
    }

    void logout() {
        System.out.println("Logout from the website");
    }

    public static void main(String[] args) {
        Zoom a1 = new Zoom();
        a1.Login();
        a1.logout();
        a1.Search();
        result1();
        result();
        a1.statement();
    }
}
