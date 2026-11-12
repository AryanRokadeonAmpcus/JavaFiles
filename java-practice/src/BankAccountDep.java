public class BankAccountDep {

    private double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccountDep b1 = new BankAccountDep();

        b1.deposit(10000);
        System.out.println("Balance : " + b1.getBalance());

        b1.withdraw(3000);
        System.out.println("Balance : " + b1.getBalance());

        b1.withdraw(8000);
        System.out.println("Balance : " + b1.getBalance());
    }
}
