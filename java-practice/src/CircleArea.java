public class CircleArea {
    private double radius;

    void setRadius(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double getArea() {
        return 3.12 * radius * radius;
    }

    public static void main(String[] args) {

        CircleArea c12 = new CircleArea();
        CircleArea c13 = new CircleArea();

        c12.setRadius(10);
        c13.setRadius(20);

        System.out.println(c12.getArea());
        System.out.println(c13.getArea());
    }
}
