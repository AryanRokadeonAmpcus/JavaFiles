package encapsulation.ex5;

class Employee {
    private int empId;
    private String name;
    private double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        if (salary <= 0) {
            System.out.println("Invalid Salary");
        }
        return salary;
    }
    public double employeeBonus() {
        double bonus = 0.10;
        return salary * bonus;
    }
    public double employeeBalance(){
        double balance = salary + employeeBonus();
        return balance;
    }
}


class EmployeeManagement {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Vishwajeet", 100000);

        System.out.println("Employee ID: " + emp1.getEmpId());
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Salary: " + emp1.getSalary());
        System.out.println("Employee Bonus: " + emp1.employeeBonus());
        System.out.println("Total balance: "+emp1.employeeBalance());

    }
}