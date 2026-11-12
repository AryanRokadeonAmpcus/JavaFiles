class Vehicle {
    void start(){
        System.out.println("The vehcile Starting to move!!!");
    }
}
class Carz extends Vehicle{
    void drive(){
        System.out.println("The car i drove across the town!!!");
    }
}
class Testt{
    public static void main(String[] args) {
        Carz C1 = new Carz();
        C1.drive();
        C1.start();
    }
}