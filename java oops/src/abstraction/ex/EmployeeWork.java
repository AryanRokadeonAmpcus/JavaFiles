package abstraction.ex;

abstract class Employee{
    abstract void work();
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer Needs to attend meetings");
    }
}
class EmployeeWork{
    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.work();
    }
}