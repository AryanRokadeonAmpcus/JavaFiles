package constructor.ex2;

public class Product {
    String productname;
    int price;

    Product(String productname, int price){
        this.productname = productname;
        this.price = price;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 45);
        System.out.println(p1.productname + " : " + p1.price);

    }

}
