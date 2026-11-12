package inheritance.ex5;

class Vehicle {

        void start() {
            System.out.println("Vehicle Started");
        }
    }

    class Car extends Vehicle {

        void drive() {
            System.out.println("Car Driving");
        }
    }

    class SportsCar extends Car {

        void turboMode() {
            System.out.println("Turbo Mode ON");
        }

        public static void main(String[] args) {
            SportsCar s = new SportsCar();

            s.start();
            s.drive();
            s.turboMode();
        }

    }