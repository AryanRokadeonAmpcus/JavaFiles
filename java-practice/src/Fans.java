public class Fans {
    String colors;

    Fans(String c){
    colors = c;
    }

    void display(){
        System.out.println(colors+": Is the fan color ");
    }

    public static void main(String[]args) {
        Fans f1 = new Fans("black");
        f1.display();
    }
}
