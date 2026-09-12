package SavingsAccount;

public class SavingsAccount {
    // Shared interest rate for all accounts
    private static double annualInterestRate = 0.0;
    
    // Balance unique to each individual account
    private double savingsBalance;

    // Constructor to initialize balance
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Calculate monthly interest and add it to the balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to change the shared interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Getter method to check the current balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
