class Circle {
      double radius;

Circle(double r){
    this.radius = r;
}
void area(){
    double area = 3.14 * radius * radius;
    System.out.println("The area of circle is : "+area);
}

public static void main(String[] args) {
    Circle c1 =  new Circle(12);
    Circle c2 = new Circle(124);

    c1.area();
    c2.area();

}


}

