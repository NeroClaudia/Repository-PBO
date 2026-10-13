public class BankMain {
    public static void main(String[] args) {
        
        PremiumSavingsAccount premium = new PremiumSavingsAccount("PA001", "Nero", 10000000, 0.05, 0.02);

        System.out.println("Eligible for Premium: " + premium.isPremiumEligible());

        premium.info();

        System.out.println("\nRegular Interest: Rp" + premium.calculateInterest());

        System.out.println("Bonus Interest: Rp" + String.format("%,.0f", premium.getBonusInterest()));
        
        System.out.println("Total Interest: Rp" + String.format("%,.0f", premium.calculateTotalInterest()));

        premium.withdraw(500000);

        premium.deposit(1000000);

        System.out.println("Final Balance: Rp" + String.format("%,.0f", premium.getBalance()));
    }
}
