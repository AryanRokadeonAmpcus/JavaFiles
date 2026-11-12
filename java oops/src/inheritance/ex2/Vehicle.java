package inheritance.ex2;

class Vehicle {
        void speed() {
            System.out.println("Vehicle Speed");
        }
    }

    class Car extends Vehicle {

        @Override
        void speed() {
            System.out.println("Car Speed 120 kmph");
        }

        public static void main(String[] args) {
            Car c = new Car();
            c.speed();
        }
    }