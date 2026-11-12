package abstraction.ex1;

    abstract class Payment {

        abstract void pay();
    }

    class UPI extends Payment {

        @Override
        void pay() {
            System.out.println("Payment through UPI");
        }
    }

    class Card extends Payment {

        @Override
        void pay() {
            System.out.println("Payment through Card");
        }
    }

    public class Payments {

        public static void main(String[] args) {

            Payment p;

            p = new UPI();
            p.pay();

            p = new Card();
            p.pay();
        }
    }

