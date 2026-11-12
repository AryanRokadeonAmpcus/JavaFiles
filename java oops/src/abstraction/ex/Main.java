package abstraction.ex;


abstract class Animal {

    abstract void sound();   // abstract method
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}