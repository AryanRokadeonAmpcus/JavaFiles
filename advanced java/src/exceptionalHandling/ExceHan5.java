package exceptionalHandling;
class MinimumBalanceException extends Exception {

    MinimumBalanceException(String msg) {
        super(msg);
    }
}

public class ExceHan5 {

    static void checkBalance(int balance)
            throws MinimumBalanceException {

        if(balance < 1000) {
            throw new MinimumBalanceException(
                    "Maintain Minimum Balance 1000");
        }

        System.out.println("Account Active");
    }

    public static void main(String[] args) {

        try {
            checkBalance(500);
        }

        catch(MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
