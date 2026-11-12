package abstraction.ex;

abstract class Shape {
    abstract void draw ();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Draw a circle ");
    }
}

class Shapes{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
    }
}