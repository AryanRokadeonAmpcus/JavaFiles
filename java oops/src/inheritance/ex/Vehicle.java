package inheritance.ex;

class Vechicle {
 void start(){
        System.out.println("The vehicle is started ");
    }
}
class Car extends Vechicle{
    void drive(){
        System.out.println("The car should be driven by a person");
    }
    public static void main(String[] args) {

        Car C1 = new Car();

        C1.start();
        C1.drive();

    }

}

