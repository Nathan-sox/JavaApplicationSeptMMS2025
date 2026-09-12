package SavingsAccount;

public class SavingsAccountTest {
    public static void main(String[] args) {
        // Create two savings accounts with initial balances
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set interest rate to 4% (0.04)
        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Balances for 12 months at 4% interest:");
        System.out.printf("%-10s %-15s %-15s%n", "Month", "Saver 1 Bal", "Saver 2 Bal");
        
        // Loop through 12 months of interest
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            
            System.out.printf("Month %-5d $%-14.2f $%-14.2f%n", 
                    month, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        // Set interest rate to 5% (0.05)
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nChanging interest rate to 5%...");

        // Calculate next month's interest (Month 13)
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("New balances after 1 month at 5% interest:");
        System.out.printf("Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.getSavingsBalance());
    }
}

