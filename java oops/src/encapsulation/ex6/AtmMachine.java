package encapsulation.ex6;

class ATM {
    private int pin;
    private double balance;

    ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void checkBalance(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    public void deposit(int enteredPin, double amount) {
        if (enteredPin == pin) {
            balance += amount;
            System.out.println("₹" + amount + " Deposited Successfully.");
            System.out.println("New Balance: ₹" + balance);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    public void withdraw(int enteredPin, double amount) {
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " Withdrawn Successfully.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }

    public void changePin(int oldPin, int newPin) {
        if (oldPin == pin) {
            pin = newPin;
            System.out.println("PIN Changed Successfully.");
        } else {
            System.out.println("Incorrect Old PIN!");
        }
    }
}

public class AtmMachine{
    public static void main(String[] args) {

        ATM atm = new ATM(1234, 10000);

        atm.checkBalance(1234);

        atm.deposit(1234, 2000);

        atm.withdraw(1234, 5000);

        atm.changePin(1234, 5678);

        atm.checkBalance(1234);

        atm.checkBalance(5678);
    }
}