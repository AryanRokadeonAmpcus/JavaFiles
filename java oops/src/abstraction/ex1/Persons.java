package abstraction.ex1;

abstract class Person{
    abstract void display();
}
class Student extends Person {
    @Override
    void display() {
        System.out.println("Kasie ho Bacchoo");
    }
}
class Persons {
    public static void main(String[] args) {

        Person s1 = new Student();
        s1.display();
    }
}