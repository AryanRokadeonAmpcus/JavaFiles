class Employee{
    String name;
    int salary;


    Employee(String n){
this.name = n;
    }
    Employee(String n, int s){
    this.name = n;
    this.salary = s;
    }
    Employee(){
        System.out.println("Employee Created");
    }
    void display(){
        System.out.println("The employee name is :"+name +" & The Salary is ="+salary);
    }

    public static void main(String[] args) {
        Employee eq1 = new Employee("Suresh Monadale",1223144);
        Employee eq2 = new Employee("Sailesh");
        Employee eq3 = new Employee();

        eq2.display();
        eq1.display();
        eq3.display();
    }
}