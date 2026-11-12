public class Stuudentt {
    int marks;
    String name;

    void display(){
        System.out.println("Name is : " + name);
        System.out.println("Marks are : "+ marks);
    }

    public static void main(String[]args) {

        Stuudentt s14 = new Stuudentt();
        Stuudentt s23 = new Stuudentt();

        s14.marks = 1223;
        s14.name = "Sankett";

        s23.name = "SiuuSPedd";
        s23.marks = 1235;

        s14.display();
        s23.display();
    }
}
