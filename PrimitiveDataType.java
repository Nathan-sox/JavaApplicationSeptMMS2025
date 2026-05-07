public class PrimitiveDataType{
	public static void main(String[] args){
		byte myAge = 30;
		System.out.printf("Ms Mercy is %d eyars old%n", myAge);
		
		short quantity = 20000;
		System.out.printf("The quantity of iPhones ordered is %,d%n", quantity);
		
		int nigerianPopulation = 294848848;
		System.out.printf("The population of Nigeria is %,d", nigerianPopulation);
		
		long wordPopulation = 3784365410381810394L;
		System.out.printf("The world's population is %,d%n", wordPopulation);
		
		float price = 577858.84747F;
		System.out.printf("The price of each iphone per unit is %,.2f%n", price);
		
		double myBalance = 10837089717.84747474;
		System.out.printf("My account balance is %c%,.2f%n", '$', myBalance);
		
		char symbol = '%';
		System.out.printf("There is an increment in the worlds's population by 20.5%c%n", symbol);
		
		boolean isJavaFun = true;
		System.out.printf("Do you love java? %b",isJavaFun);
	}
}