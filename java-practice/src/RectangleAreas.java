public class RectangleAreas {
    private int length;
    private int breadth;

    void setLength(int length){
        this.length = length;
    }
    void setBreadth(int breadth){
        this.breadth = breadth;
    }
    int getLength(){
        return length;
    }
    int getBreadth(){
        return breadth;
    }
    int getArea() {
        return length * breadth;
    }

    public static void main(String[]args) {

        RectangleAreas re1 = new RectangleAreas();
        RectangleAreas re2 = new RectangleAreas();

        re1.setLength(10);
        re1.setBreadth(10);
        re2.setLength(12);
        re2.setBreadth(10);

        System.out.println("The area is : "+re1.getArea());
        System.out.println("The area is : "+re2.getArea());
    }
}
