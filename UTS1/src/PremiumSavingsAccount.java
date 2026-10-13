public class PremiumSavingsAccount extends SavingsAccount {
    
    private double minimumBalance;
    private double bonusRate;

    public PremiumSavingsAccount(String accountNumber, String ownerName, double balance, double interestRate, double bonusRate) {
        super(accountNumber, ownerName, balance, interestRate);

        this.bonusRate = bonusRate;
    }

    public double getBonusInterest() {
        return balance * bonusRate;
    }

    public boolean isPremiumEligible() {
        return balance >= minimumBalance;
    }

    public double calculateTotalInterest() {
        return calculateInterest() + getBonusInterest();
    }

    @Override
    public void info() {
        super.info();

        System.out.println("=== Premium Account Information ===");
        System.out.println("Bonus Rate      : " + (bonusRate * 100) + "%");
        System.out.println("Bonus Interest  : " + String.format("%,.0f", getBonusInterest()));
    }
}
