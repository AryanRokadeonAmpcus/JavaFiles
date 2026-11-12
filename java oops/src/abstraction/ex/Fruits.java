package abstraction.ex;

abstract class Fruit {
    abstract void eat();
}

class Apple extends Fruit {
    void eat (){
        System.out.println("Eat apple everyday");
    }
}
class Fruits {
    public static void main(String[] args) {
        Apple a1  = new Apple();
        a1.eat();
    }
}