package abstraction.ex1;

abstract class Bank {


    abstract double getInterest();
}

class SBI extends Bank {

    @Override
    double getInterest() {
        return 7.5;
    }
}

public class Banks{

    public static void main(String[] args) {

        Bank b = new SBI();

        System.out.println("Interest Rate = " + b.getInterest());
    }
}