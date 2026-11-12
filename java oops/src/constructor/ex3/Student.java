package constructor.ex3;

public class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Aryan", 24);

        s1.display();
        s2.display();
        System.out.println(s1.name+ " : "+ s1.age);
        System.out.println(s2.age+ " : "+ s2.age);

    }
}