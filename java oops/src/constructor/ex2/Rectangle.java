package constructor.ex2;

public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {

//   can also useb by method
//        int area = length * width;
//        return area;

        return length * width;

    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(12,21);

        System.out.println(r1.area());
    }
}