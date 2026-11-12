package inheritance.ex;

class Shape {
    void displayShape(){
        System.out.println("All shapes have area");
    }
}
class Circle extends Shape{
    double radius = 21;
    void displayRadius(){
        System.out.println(3.12 * radius * radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.displayRadius();
        c1.displayShape();
    }
}
