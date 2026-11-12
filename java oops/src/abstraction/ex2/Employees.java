package abstraction.ex2;

    abstract class Employee {

        abstract void work();
    }

    class Developer extends Employee {

        @Override
        void work() {
            System.out.println("Writing Code");
        }
    }

    class Tester extends Employee {

        @Override
        void work() {
            System.out.println("Testing Application");
        }
    }

    public class Employees {

        public static void main(String[] args) {

            Employee e;

            e = new Developer();
            e.work();

            e = new Tester();
            e.work();
        }
    }

