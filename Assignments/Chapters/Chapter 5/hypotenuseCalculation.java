import java.util.Scanner;

public class hypotenuseCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1;
        int side2;

        System.out.printf("Side 1: ");
        side1 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Side 2: ");
        side2 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("The Hypotenuse: %.2f", hypotenuse(side1, side2));

        scanner.close();
    }

    public static double hypotenuse(int side1, int side2) {
        double result;

        result = Math.pow(side1, 2) + Math.pow(side2, 2);

        result = Math.sqrt(result);

        return result;
    }
}