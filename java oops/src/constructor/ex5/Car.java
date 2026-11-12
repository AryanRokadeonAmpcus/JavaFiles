package constructor.ex5;

public class Car {
    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {

        Car[] cars = new Car[3];

        cars[0] = new Car("BMW", 5000000);
        cars[1] = new Car("Audi", 4500000);
        cars[2] = new Car("Tesla", 7000000);

        for (int i = 0; i < cars.length; i++) {
            cars[i].display();
        }
    }
}