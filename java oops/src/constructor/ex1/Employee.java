package constructor.ex1;
//Default Constructor

public class Employee {
    int employeeid;

    Employee() {

        employeeid = 101;
    }

    public static void main(String[] args) {

        Employee em1 = new Employee();

        System.out.println("Mahesh Shirsat employee "+em1.employeeid);
    }
}