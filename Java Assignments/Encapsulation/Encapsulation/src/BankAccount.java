public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Overriden functinos
    public String toString() {
        return "Account Number: " + accountNumber
                + "\nAccount Holder: " + accountHolder
                + "\nBalance: " + balance;
    }
    // End of Overriden functions

    // Getter and Setter Functions
    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setHolder(String newAccountHolder) {
        this.accountHolder = newAccountHolder;
    }

    public String getHolder() {
        return this.accountHolder;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public double getBalance() {
        return this.balance;
    }
    // End of Getter and Setters

    // Actions to perform
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Please Input a Valid Amount to deposit.");
        } else {
            balance += amount;
            System.out.println("You Deposited " + amount);
            System.out.println("Your Balance is " + balance);
        }
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Your Balance is Insufficient.");
        } else {
            balance -= amount;
            System.out.println("You Withdrawed " + amount);
            System.out.println("Your Balance is " + balance);
        }
    }

    public void displayAccountDetails() {
        System.out.println(toString());
    }

}