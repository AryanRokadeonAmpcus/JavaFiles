package polymorphism.ex;

class Student {

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int rollNo) {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNo);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.display("Aryan");
        s.display("Aryan", 21);
    }
}