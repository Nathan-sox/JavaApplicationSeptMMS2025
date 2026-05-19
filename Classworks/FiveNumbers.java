import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, product = 1;

        double[] nums = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextDouble();
            sum += nums[i];
            product *= nums[i];
        }

        double avg = sum / 5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Product: " + product);
    }
}