import java.uti.Random;

public class UsingRandomClass{
	public static void main(String[] args){
		RAndom random = new Random();
		
		int generatedint = random.nextInt(0, 1500gf);
		System.out.printf("The generated number is %d%n", generatedint);
	}
}