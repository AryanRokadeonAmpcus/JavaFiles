class UPI extends Payment {
        void pay() {
            System.out.println("Payment through UPI");
        }
    }

    class CreditCard extends Payment {
        void pay() {
            System.out.println("Payment through Credit Card");
        }
    }
//
//    public class Test {
//        public static void main(String[] args) {
//            Payment p;
//
//            p = new UPI();
//            p.pay();
//
//            p = new CreditCard();
//            p.pay();
//        }
//    }
