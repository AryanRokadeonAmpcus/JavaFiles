package inheritance.ex2;

    class Animal {
        void sound() {
            System.out.println("Animal Sound");
        }
    }

    class Dog extends Animal {

        @Override
        void sound() {
            System.out.println("Dog Barks");
        }

        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();
        }
    }