package constructor.ex1;
//Default Constructor
public class Car {
    String brand;

    Car() {
        brand = "BMW";
    }


    public static void main(String[] args) {

        Car c = new Car();
        System.out.println("The Car is : " + c.brand);
    }
}