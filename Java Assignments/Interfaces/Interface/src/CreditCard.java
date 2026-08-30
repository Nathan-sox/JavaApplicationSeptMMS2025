public class CreditCard implements Payment {
    public String pay(double amount) {
        return "You payed " + amount + " with credit card";
    }
}
