package inheritance.ex5;

    class Person {

        void personInfo() {
            System.out.println("Person Details");
        }
    }

    class Employee {

        void employeeInfo() {
            System.out.println("Employee Details");
        }
    }

    class Manager extends Employee {

        void managerInfo() {
            System.out.println("Manager Details");
        }

        public static void main(String[] args) {
            Manager m = new Manager();

//            m.personInfo();
            m.employeeInfo();
            m.managerInfo();
        }
    }

