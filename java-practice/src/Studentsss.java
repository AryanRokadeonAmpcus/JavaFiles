public class Studentsss {
    String name;
    int marks;

    Studentsss(String n , int m){
        name = n;
        marks = m;
    }
    void display(){
        System.out.println(name +": "+ marks);
    }
    public static void main(String[] args) {

        Studentsss k24  = new Studentsss("Shailesh", 567);
        Studentsss k43  = new Studentsss("Gohnas", 766);
        k43.display();
        k24.display();
    }
}
