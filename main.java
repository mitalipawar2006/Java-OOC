class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of 100 required.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        sa.withdraw(350);
        sa.deposit(200);
        sa.withdraw(300);
    }
}