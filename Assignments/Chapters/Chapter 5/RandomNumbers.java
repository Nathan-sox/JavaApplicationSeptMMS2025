import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numbers = { 2, 4, 6, 8, 10 };

        System.out.printf("Number: %d", numbers[random.nextInt(numbers.length)]);
        // System.out.print(numbers.length);

        scanner.close();
    }
}
