package constructor.ex2;

public class Bank {
    int accountnumber;
    double balance;

    Bank(int accountnumber,double balance) {
     this.accountnumber = accountnumber;
     this.balance = balance;

 }

public static void main(String[] args) {
    Bank b1 = new Bank(101, 10000);

    System.out.println(b1.accountnumber);
    System.out.println(b1.balance);
    }
}