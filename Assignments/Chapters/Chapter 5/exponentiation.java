import java.util.Scanner;

public class exponentiation {
    public static void main(String[] args) {
        int base;
        int exponent;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the base(Whole Integer): ");
        base = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is the exponent(Whole Integer): ");
        exponent = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("The Result is: %d", integerPower(base, exponent));

        scanner.close();
    }

    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int exp = 0; exp < exponent; exp++) {
            result *= base;
        }

        return result;
    }
}