package abstraction.ex3;

abstract class Bank {

    abstract void deposit();
}

class SBI extends Bank {

    @Override
    void deposit() {
        System.out.println("Amount Deposited in SBI");
    }
}

class HDFC extends Bank {

    @Override
    void deposit() {
        System.out.println("Amount Deposited in HDFC");
    }
}

public class Banks {

    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.deposit();

        b = new HDFC();
        b.deposit();
    }
}
