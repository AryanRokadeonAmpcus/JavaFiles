package inheritance.ex1;


class Person {
    String name = "Aryan";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empId = 101;
    double salary = 50000;

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.displayPerson();
        e1.displayEmployee();
    }
}