class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double money){
        balance -=money;
    }

    void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);

    }

    public static void main(String[] args) {

        BankAccount b1 =
                new BankAccount("Aryan", 50000);

        b1.display();

        System.out.println("After Deposit");

        b1.deposit(10000);

        b1.display();

        System.out.println("After Withdraw : ");
        b1.withdraw(2000);
        b1.display();
    }
}