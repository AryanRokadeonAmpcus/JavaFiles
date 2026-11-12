package encapsulation.ex3;

public class Product {
    private String product;
    private int price;
    private int quantity;

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(int price) {
        if (price > 0 && price <= 10000000) {
            this.price = price;
        } else
            System.out.println("Give me Valide product");
    }

    public void setQuantity(int quantity) {
        if (quantity > 0 && quantity <= 10000000) {
            this.quantity = quantity;
        } else
            System.out.println("Give me Valide quantity");
    }

        public String getProduct () {
            return product;
        }
        public int getQuantity () {
            return quantity;
        }

        public int getPrice () {
            return price;
        }




    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setProduct("Shampooo");
        p1.setQuantity(1);
        p1.setPrice(350);

        System.out.println(p1.getProduct());
        System.out.println(p1.getQuantity());
        System.out.println(p1.getPrice());

    }

}