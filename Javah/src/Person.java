 class Person {
    String name = "Aryan";

    void displayName() {
        System.out.println(name);
    }
}

    class Student extends Person {
        int marks = 85;

        void displayMarks() {
            System.out.println(marks);
        }
    }
    class Collegse{
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.displayName();
            Student s1 = new Student();
            s1.displayName();
            s1.displayMarks();

        }
    }