package constructor.ex2;

public class Circle {
    double radius;

    Circle(double radius){

        this.radius = radius;
}

    double circlearea(){
        return radius * radius * 3.12;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(12);
        System.out.println(c1.circlearea());

      }
    }