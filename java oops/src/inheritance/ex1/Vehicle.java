package inheritance.ex1;

class Vehicle {
    String brand = "Honda";

    void displayVehicle() {
        System.out.println("Brand " + brand);
    }
}
class Bike extends Vehicle{
    String model = "CB350RS";

    void displayBike() {
        System.out.println("Model " + model);
    }

    public static void main(String[] args) {
        Bike b1  = new Bike();

        b1.displayVehicle();
        b1.displayBike();
    }
}
