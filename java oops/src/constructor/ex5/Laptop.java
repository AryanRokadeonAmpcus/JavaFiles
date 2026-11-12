package constructor.ex5;

public class Laptop {

    String brand;
    int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    Laptop(Laptop l) {
        this.brand = l.brand;
        this.price = l.price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Dell", 60000);

        Laptop l2 = new Laptop(l1);

        l1.display();
        l2.display();
    }
}

