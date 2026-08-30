public class BankTransfer implements Payment {
    public String pay(double amount) {
        return "You payed " + amount + " with bank transfer";
    }

}
