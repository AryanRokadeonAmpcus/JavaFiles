package Interface.ex;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class Animals {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}