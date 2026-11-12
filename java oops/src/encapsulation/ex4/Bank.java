package encapsulation.ex4;

public class Bank {

    String accountHolder;
    double balance;

    Bank(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double money) {
        balance -= money;
    }

    void getBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);

    }

    public static void main(String[] args) {

        Bank b1 = new Bank("Aryan", 10000);
        Bank b2 = new Bank("Ashuotosh", 10000);
        Bank b3 = new Bank("Atharva", 10000);

        b1.deposit(2000);
        b2.deposit(5000);
        b3.deposit(1500);

        b1.withdraw(2);
        b2.withdraw(20);
        b3.withdraw(100);

        b1.getBalance();
        b2.getBalance();
        b3.getBalance();

    }
}