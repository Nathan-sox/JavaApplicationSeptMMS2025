public class TypeCasting{
	public static void main(String[] args){
		int num1 = 200;
		int num2 = 50;
		double division = (double) num1/num2;
		System.out.printf("Dizvision of %d and %d: %", num1, num2, division)
		
		double price = 7688;
		System.out.printf("The price of the laptop is %d%n", price);
		
		double balance = 5666.574;
		int covertedBalance = (int) balance;
		System.out.printf("This converted balance is %d%n", convertedBalance);
		
		char symbol = '!';
		int convertedSymbol = (int) symbol;
		System.out.printf("Converted Symbol is %d%n", convertedSymbol);
	}
}