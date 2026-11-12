package encapsulation.ex1;

public class Main {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        m1.setBrand("Xiaomi");
        m1.setPrice(32000);

        System.out.println(m1.getBrand());
        System.out.println(m1.getPrice());
    }
}
