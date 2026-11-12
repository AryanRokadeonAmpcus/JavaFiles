package encapsulation.ex1;

public class Employee {
    private String empid;
    private int empsalary;

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }

    public String getEmpid() {
        return empid;
    }

    public int getEmpsalary() {
        return empsalary;
    }
}
