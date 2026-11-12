package constructor.ex1;
//Default Constructor

public class Person {
    int age;

    Person() {
        age = 12;
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println("The person age is : "+p1.age);
    }
}