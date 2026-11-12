package polymorphism.ex;

    class AreaCalculator {

        void area(int side) {
            System.out.println("Square Area = " + (side * side));
        }

        void area(int length, int breadth) {
            System.out.println("Rectangle Area = " + (length * breadth));
        }

        public static void main(String[] args) {

            AreaCalculator a = new AreaCalculator();

            a.area(5);
            a.area(10, 5);
        }
    }