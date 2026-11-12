package polymorphism.ex1;

   public class Animal {

        void sound() {
            System.out.println("Animal Sound");
        }
    }

    class Dog extends Animal {

        @Override
        void sound() {
            System.out.println("Dog Barks");
        }
    }

