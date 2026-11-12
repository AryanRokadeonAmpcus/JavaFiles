package inheritance.ex2;

class Employee {
        void salary() {
            System.out.println("Base Salary");
        }
    }

    class Manager extends Employee {

        @Override
        void salary() {
            System.out.println("Manager Salary = 80000");
        }

        public static void main(String[] args) {
            Manager m = new Manager();
            m.salary();
        }
    }
