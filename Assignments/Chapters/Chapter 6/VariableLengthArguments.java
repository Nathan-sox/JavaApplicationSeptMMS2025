public class VariableLengthArguments {
    public static void main(String[] args) {

        // Testing the method with different numbers of arguments
        System.out.printf("Product of 5: %d%n", product(5));
        System.out.printf("Product of 2 and 4: %d%n", product(2, 4));
        System.out.printf("Product of 1, 3, 5, and 7: %d%n", product(1, 3, 5, 7));
        System.out.printf("Product of 2, 4, 6, 8, and 10: %d%n", product(2, 4, 6, 8, 10));
        System.out.printf("Product of zero arguments: %d%n", product());

    }

    public static int product(int... numbers) {
        // Handle the edge case where no arguments are passed
        if (numbers.length == 0) {
            return 0;
        }

        int result = 1;

        // Loop through the variable-length argument array
        for (int number : numbers) {
            result *= number;
        }

        return result;
    }
}