import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Smallest possible array to handle the worst-case scenario of 5 unique numbers
        int[] uniqueNumbers = new int[5];
        int count = 0; // Tracks the number of unique inputs stored

        System.out.println("Enter 5 numbers between 10 and 100 inclusive:\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            int number = input.nextInt();

            // Validate that the number falls within the specified range
            if (number < 10 || number > 100) {
                System.out.println("Invalid input. Number must be between 10 and 100.");
                i--; // Decrement loop counter to retry this slot
                continue;
            }

            // Check if the entered number is a duplicate of an existing unique number
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (uniqueNumbers[j] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it is unique, store it and print it immediately
            if (!isDuplicate) {
                uniqueNumbers[count] = number;
                count++;
                System.out.printf("Unique number detected: %d%n", number);
            }

            // Display the complete set of unique values input so far
            System.out.print("Unique values stored so far: ");
            for (int j = 0; j < count; j++) {
                System.out.print(uniqueNumbers[j] + " ");
            }
            System.out.println("\n");
        }

        input.close();
    }
}
