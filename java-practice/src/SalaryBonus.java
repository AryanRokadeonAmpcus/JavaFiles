public class SalaryBonus {
    private String name;
    private double salary;
    void setName(String name){
        this.name = name;
    }

    void setSalary(double salary){
        this.salary = salary;
    }

    String getName(){
        return name;
    }

    double getSalary(){
        return salary;
    }
    double getBonus(){
        return 10 * 0.01 * salary;
    }

    double getCalculateBonus(){
        return getBonus()+ salary;
    }
    public static void main(String[] args) {
        SalaryBonus sb1 = new SalaryBonus();
        SalaryBonus sb2 = new SalaryBonus();

        sb1.setName("Sanket Lonkar");
        sb1.setSalary(10000);

        sb2.setName("Vedant Kudale");
        sb2.setSalary(20000);

        System.out.println("The employee :"+sb1.getName()+" the salary is ="+ sb1.getSalary() +"The bonus getting :"+ sb1.getBonus());
        System.out.println("After bonus");
        System.out.println("The bonus is :" + sb1.getCalculateBonus());

        System.out.println("The employee :"+sb2.getName()+" the salary is ="+ sb2.getSalary()+"The bonus getting :"+ sb2.getBonus());
        System.out.println("After bonus");
        System.out.println("The bonus is :" + sb2.getCalculateBonus());

    }
}
