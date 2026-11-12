class Car{
    String brand;
    int price;

Car(String b, int p){
    this.brand  = b;
    this.price  = p;
  }

  void AsapShow(){
      System.out.println(brand + " : " + price);
  }

  public static void main(String[] args) {

      Car c12  = new Car("Verna",123214);
      Car c123 = new Car("bmw",123314 );

      c123.AsapShow();
      c12.AsapShow();
  }
}