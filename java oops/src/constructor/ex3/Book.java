package constructor.ex3;

public class Book {

    String bookname;
    int price;

    Book() {
        bookname = "idk";
        price = 0;
    }

    Book(String bookname, int price) {
        this.bookname = bookname;
        this.price = price;
    }

    void display() {
        System.out.println("Book Name: " + bookname);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Karakitsu", 120);

        b1.display();
        b2.display();
    }
}
