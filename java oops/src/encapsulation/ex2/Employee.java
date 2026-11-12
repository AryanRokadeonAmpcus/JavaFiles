package encapsulation.ex2;

public class Employee {
    private int id  = 122;

    public int getId() {
        return id;
    }


    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.getId();

        System.out.println(emp1.getId());
    }
}