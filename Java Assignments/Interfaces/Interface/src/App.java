public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bank Transfer: " + new BankTransfer().pay(1000.0));
        System.out.println("Credit Card: " + new CreditCard().pay(1000.0));
        System.out.println("Mobile Wallet: " + new MobileWallet().pay(1000.0));
    }
}
