package encapsulation.ex3;

import java.util.Scanner;

public class Atm {
    private int pin;

    public void setPin(int pin){
        if (pin == 333){
            this.pin = pin;
            System.out.println("Hurray password Unlocked");
        }else
            System.out.println("Invalid pin");
    }
    public int getPin(){
        return pin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm a1 = new Atm();

        a1.setPin(sc.nextInt());
    }
}
