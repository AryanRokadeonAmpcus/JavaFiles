public class Stuudent {
    void display(int marks ,String name ){
        System.out.println(marks +" : "+ name);

    }

    public static void main() {
        Stuudent s12 = new Stuudent();
        Stuudent s13 = new Stuudent();

        s12.display(120, "Aryan");
         s13.display(105,"Baldev");
    }
}

