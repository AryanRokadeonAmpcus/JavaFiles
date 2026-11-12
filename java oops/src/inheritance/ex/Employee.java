package inheritance.ex;

class Employee {
    void work(){
        System.out.println("Every employee has some work to do");
    }
}
class Manager extends Employee{
     void manageTeam(){
        System.out.println("Manager works is to do Management");
    }

    public static void main(String[] args) {
        Manager emg = new Manager();

        emg.work();
        emg.manageTeam();
    }
}
