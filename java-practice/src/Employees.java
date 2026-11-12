import java.util.Scanner;

class Employees {
    private String name;
    private int salary;

    void setName(String name) {
        this.name = name;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employees ew1 = new Employees();
        Employees ew2 = new Employees();

        ew1.setName(sc.nextLine());
        ew1.setSalary(sc.nextInt());
        sc.nextLine(); // important

        ew2.setName(sc.nextLine());
        ew2.setSalary(sc.nextInt());

        System.out.println(ew1.getName() + ": " + ew1.getSalary());
        System.out.println(ew2.getName() + ": " + ew2.getSalary());

        sc.close();
    }
}