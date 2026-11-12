package constructor.ex2;
//Parameterized Constructor
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
// also Can be used but prefrable is this

//    Student(String n, int a) {
//        name = n;
//        age = a;
//    }

    public static void main(String[] args) {
       Student s1 = new Student("Aryan",24);
        System.out.println("name : "+s1.name);
        System.out.println("age : "+s1.age);
    }
}