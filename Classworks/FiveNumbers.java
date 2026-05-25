import java.util.Scanner;

public class FiveNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, product = 1;

        double[] nums = new double[5];
		
		System.out.print("Enter number " + "1" + ": ");
		nums[0] = sc.nextDouble();
		sum += nums[0];
		product *= nums[0];
		
		System.out.print("Enter number " + "2" + ": ");
		nums[1] = sc.nextDouble();
		sum += nums[1];
		product *= nums[1];
		
		System.out.print("Enter number " + "3" + ": ");
		nums[2] = sc.nextDouble();
		sum += nums[2];
		product *= nums[3];
		
		System.out.print("Enter number " + "4" + ": ");
		nums[3] = sc.nextDouble();
		sum += nums[3];
		product *= nums[4];

        double avg = sum / 5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Product: " + product);
    }
}