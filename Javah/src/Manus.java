class Animal1 {

    Animal1() {
        shuhs();
    }
    void shuhs(){
            System.out.println("The animal makes a sound");
        }
    }

class Dog2 extends Animal1 {
    //    public void animalSound() {
    Dog2() {
        sdogf();
    }
        void sdogf () {
//        super.animalSound(); // Call the parent method
            System.out.println("The dog says: bow wow");
        }
    }


public class Manus {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
//        myDog.animalSound();
    }
}