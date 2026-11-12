package encapsulation.ex3;

public class Car {
    private String brand;
    private int speed;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setSpeed(int speed){
        if (speed >= 0 && speed <= 200 ){
            this.speed = speed;
        }else
            System.out.println("Invalid speedometer");
    }

    public String getBrand(){
        return brand;
    }
    public int getSpeed(){
        return speed;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("BMW");
        c1.setSpeed(124);

        System.out.println(c1.getBrand()+" is driving on "+c1.getSpeed()+" km/h");
    }
}
