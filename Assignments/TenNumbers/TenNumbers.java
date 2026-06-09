import java.util.Scanner;

public class TenNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.printf("Enter number %d: ", i+1);
			numbers[i] = scanner.nextInt();
		}
		
		int sum1 = sum(numbers[0], numbers[4], numbers[9]);
		int sum2 = sum(numbers[2], numbers[7], numbers[1]);
		int sum3 = sum(numbers[3], numbers[6], numbers[5], numbers[8]);
		
		int c  alculation = sum3 - sum2 * sum1;
		
		if(calculation >= 100){
			System.out.printf("\nSum of numbers 1, 5, 10: %d", sum1);
			System.out.printf("\nSum of numbers 3, 8, 2: %d", sum2);
			System.out.printf("\nSum of numbers 4, 7, 6, 9: %d", sum3);
			System.out.printf("\nCalculation: %d", calculation);
			System.out.println("\nHurray I did it!!");
		}
		else{
			System.out.printf("\nSum of numbers 1, 5, 10: %d", sum1);
			System.out.printf("\nSum of numbers 3, 8, 2: %d", sum2);
			System.out.printf("\nSum of numbers 4, 7, 6, 9: %d", sum3);
			System.out.printf("\nCalculation: %d", calculation);
			System.out.println("\nI still need to learn more Java");
		}
		
		scanner.close();
	}
	
	public static int sum(int num1, int num2){
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	public static int sum(int num1, int num2, int num3, int num4){
		return num1 + num2 + num3 + num4;
	}
}