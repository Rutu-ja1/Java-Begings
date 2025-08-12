// Abstract class BankAccount
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayBalance();
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // calling superclass constructor
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account " + accountNumber + " Balance: " + balance);
    }
}

// CheckingAccount subclass
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Exceeds overdraft limit or invalid amount.");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Checking Account " + accountNumber + " Balance: " + balance);
    }
}

// Main class to test
public class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA101", 1000, 0.03);
        sa.deposit(500);
        sa.withdraw(200);
        sa.displayBalance();

        System.out.println();

        CheckingAccount ca = new CheckingAccount("CA202", 500, 200);
        ca.deposit(300);
        ca.withdraw(900);
        ca.displayBalance();
    }
}
