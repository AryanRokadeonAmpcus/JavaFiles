package abstraction.ex;

abstract class WaterBottle {

    abstract void drink();

   }

class NormalBottle extends WaterBottle {
    @Override
    void drink() {
        System.out.println("Drink water with the help of water bottles");
    }
}
class Bottle{
    public static void main(String[] args) {
      NormalBottle n1 = new NormalBottle();
        n1.drink();
    }
}
