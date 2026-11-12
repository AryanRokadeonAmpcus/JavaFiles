package inheritance.ex4;

class Person {

    Person() {
        System.out.println("Parent Constructor");
    }
}

class Student extends Person {

    Student() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}