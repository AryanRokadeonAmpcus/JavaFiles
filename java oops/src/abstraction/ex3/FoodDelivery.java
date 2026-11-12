package abstraction.ex3;

abstract class FoodOrder {

    abstract void orderFood();
}

class Pizza extends FoodOrder {

    @Override
    void orderFood() {
        System.out.println("Pizza Ordered");
    }
}

class Burger extends FoodOrder {

    @Override
    void orderFood() {
        System.out.println("Burger Ordered");
    }
}

public class FoodDelivery {

    public static void main(String[] args) {

        FoodOrder f;

        f = new Pizza();
        f.orderFood();

        f = new Burger();
        f.orderFood();
    }
}