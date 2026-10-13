public class SavingsAccount extends BankAccount{
    
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override 
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw ");
            return false;
        }

        if (balance - amount < 100000) {
            System.out.println("Minimum balance must be Rp 100.000");
            return false;
        }

        return super.withdraw(amount);
    }

    @Override
    public void info() {
        super.info();

        System.out.println("=== Savings Account Information ===");
        System.out.println("Interest Rate       :" + (interestRate * 100) + "%");
        System.out.println("Annual Interest     :" + String.format("%,.0f", calculateInterest()));
    }
} 
