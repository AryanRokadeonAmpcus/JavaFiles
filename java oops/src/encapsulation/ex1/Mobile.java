package encapsulation.ex1;

public class Mobile {
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getBrand() {
        return brand;

    }

    public int getPrice() {
        return price;

    }
}