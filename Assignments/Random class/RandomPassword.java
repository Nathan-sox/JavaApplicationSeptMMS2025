import java.util.Random;
import java.util.Scanner;

public class RandomPassword{
	public static void main(String[] args){
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String passwordPool = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*:?><~`";
		
		String randomPassword = "";
		
		System.out.print("Hit Enter To Generate a Random 15 Character Password");
		scanner.nextLine();
		
		for(int i = 0; i < 15; i++){
			randomPassword += passwordPool.charAt(random.nextInt(passwordPool.length()));
		}
		
		System.out.println(randomPassword);
		
		scanner.close();
	}
	
}