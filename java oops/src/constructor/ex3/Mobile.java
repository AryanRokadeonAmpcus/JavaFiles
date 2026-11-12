package constructor.ex3;

public class Mobile {
    String brand;
    int price;

    Mobile() {
        brand = "null";
        price = 0;
    }

    Mobile(String brand) {
        this.brand = brand;
    }

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {

        System.out.println("Brand Name: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m2 = new Mobile();
        Mobile m1 = new Mobile("Dk", 123);
        m1.display();
        m2.display();
    }
}