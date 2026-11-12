package constructor.ex1;
//Default Constructor

public class Student {
    String name;
    Student() {
        name = "Aryan";

    }


    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.name);
    }
}