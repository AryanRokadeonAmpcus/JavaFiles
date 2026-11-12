public class Fan {
    void on(){
        System.out.println("Turn on the Fan..!");
    }
    void off(){
        System.out.println("Turn off the Fan..!");
    }


   public static void main(String[]args) {
        Fan f1 = new Fan();

        f1.on();
        f1.off();
    }
}
