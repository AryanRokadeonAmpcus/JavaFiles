package constructor.ex5;

public class Mobile {

        String brand;
        int price;

        Mobile() {
            this("Samsung");
            System.out.println("Default Constructor");
        }

        Mobile(String brand) {
            this(brand, 20000);
            System.out.println("One Parameter Constructor");
        }

        Mobile(String brand, int price) {
            this.brand = brand;
            this.price = price;
            System.out.println("Two Parameter Constructor");
        }

        public static void main(String[] args) {

            Mobile m1 = new Mobile();
        }
    }