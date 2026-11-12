package abstraction.ex1;

    abstract class Appliance {

        abstract void turnOn();
    }

    class Fan extends Appliance {

        @Override
        void turnOn() {
            System.out.println("Fan is ON");
        }
    }

    public class Appliances {

        public static void main(String[] args) {

            Appliance a = new Fan();
            a.turnOn();
        }
    }

