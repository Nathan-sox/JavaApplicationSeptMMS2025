import java.util.Random;
import java.util.Scanner;

public class RandomAccNumber{
	public static void main(String[] args){
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String passwordPool = "1234567890";
		
		String accNumber = "30";
		
		int accNumberLength = 10;
		int usableaccNumberLength = accNumberLength - accNumber.length();
		
		for(int i = 0; i < usableaccNumberLength; i++){
			accNumber += passwordPool.charAt(random.nextInt(passwordPool.length()));
		}
		
		System.out.println("ACCOUNT NUMBER GENERATOR\n");
		
		System.out.println("Hit Enter to receive your account number");
		scanner.nextLine();
		System.out.println("Your Account Number is: " + "** " + accNumber + " **");
		
		scanner.close();
	}
}