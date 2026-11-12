package abstraction.ex2;

abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike Started");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Started");
    }
}

class Bus extends Vehicle {

    @Override
    void start() {
        System.out.println("Bus Started");
    }
}

public class Vehicles{

    public static void main(String[] args) {

        Vehicle v;

        v = new Bike();
        v.start();

        v = new Car();
        v.start();

        v = new Bus();
        v.start();
    }
}
