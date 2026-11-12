package abstraction.ex;

abstract class Vehicle {

    abstract void Start ();

}
class Bike extends Vehicle {

    void Start (){
        System.out.println("Bike Started");
    }
}
class VehicleStart {
    public static void main(String[] args) {

        Bike b = new Bike();

        b.Start();

    }
}
