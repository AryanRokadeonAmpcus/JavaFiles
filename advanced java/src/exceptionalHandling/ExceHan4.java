package exceptionalHandling;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class ExceHan4 {

    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if(amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance");
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);
        }

        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}