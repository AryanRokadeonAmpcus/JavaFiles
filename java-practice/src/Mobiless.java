public class Mobiless {
    private String brand;
    private int price;

    void setBrand(String brand){
        this.brand = brand;
    }
    void setPrice(int price){
        this.price = price;
    }

   public String getBrand(){
        return brand;
   }

   public int getPrice(){
        return price;
   }


   public static void main(String[]args) {
       Mobiless m1 = new Mobiless();
       Mobiless m2 = new Mobiless();
      m1.setBrand("Redmii");
      m1.setPrice(12_000);
      m2.setBrand("iphone");
      m2.setPrice(1_39_000);

       System.out.println(m1.getBrand()+ " The lanuch price is = "+ m1.getPrice());
       System.out.println(m2.getBrand()+ " The lanuch price is = "+ m2.getPrice());
   }
}
