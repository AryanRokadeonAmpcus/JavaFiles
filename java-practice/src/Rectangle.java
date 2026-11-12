class Rectangle {
    int length;
    int breadth;

    Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        System.out.println("The area of rectangle is : "+length * breadth);
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10,12);
        Rectangle r2 = new Rectangle(21, 23);

        r1.area();
        r2.area();
    }
}