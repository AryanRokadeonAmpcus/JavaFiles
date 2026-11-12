class Shape {
    void draw(){
        System.out.println("Drawing Sahpe!!!");
    }
}
class Circle extends Shape{
    double radius;
    void setRadius(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    void Area(){
        System.out.println(radius*3.14*radius);
    }

}

class ShapeArea{
     public static void main(String[] args) {
     Circle cq1 = new Circle();
     cq1.setRadius(12);
     cq1.Area();
     cq1.draw();
    }
}
