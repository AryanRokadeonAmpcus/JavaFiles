package inheritance.ex3;

class Animal {
        void sound() {
            System.out.println("Animal Sound");
        }
    }

    class Dog extends Animal {

        void sound() {
            System.out.println("Dog Bark");
        }

        void display() {
            super.sound();

            sound();
        }

        public static void main(String[] args) {
            Dog d = new Dog();
            d.display();
        }
    }
