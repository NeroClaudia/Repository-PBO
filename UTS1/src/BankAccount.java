import java.util.ArrayList;

public class BankAccount {
    
    private String accountNumber;
    private String ownerName;
    private ArrayList<String> transactions;
    protected double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be greater than zero");
            return;
        }

        balance += amount;
            
        transactions.add("Deposit: Rp" + amount);

        System.out.println("Deposit Success");
        System.out.println("Current Balance: Rp" + String.format("%,.0f", balance));
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw must be greater than zero");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return false;
        }

        balance -= amount;
            
        transactions.add("Withdraw: Rp" + amount);

        System.out.println("Withdraw Success");
        System.out.println("Current Balance: " + String.format("%,.0f", balance));

        return true;
    }
    
    public void info() {
        System.out.println("=== Bank Account Information ===");
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Balance         : " + String.format("%,.0f", balance));
    }
}