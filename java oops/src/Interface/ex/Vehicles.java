package Interface.ex;

interface Vehicle {
void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}