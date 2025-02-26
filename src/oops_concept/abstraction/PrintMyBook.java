package oops_concept.abstraction;

abstract class book{
    String name;
    String author;
    int price;
    book(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    abstract void getDetails();
}

public class PrintMyBook extends book{
    PrintMyBook(String name, String author, int price){
        super(name, author, price);
    }
    void getDetails() {
        System.out.println(name+", "+ author+", "+price);
    }

    public static void main(String[] args) {
        book myBook = new PrintMyBook("Harry potter","J.K Rowling",120);//dynamic dispatch
        myBook.getDetails();

    }
}
