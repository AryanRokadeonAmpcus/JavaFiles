package inheritance.ex3;

class Person {
        String name = "Parent Name";
    }

    class Student extends Person {
        String name = "Child Name";

        void show() {
            System.out.println(super.name);
            System.out.println(name);
        }

        public static void main(String[] args) {
            Student s = new Student();
            s.show();
        }
    }

