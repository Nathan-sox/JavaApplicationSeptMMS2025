import java.util.Scanner;

public class DuplicateEliminationCmd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxInputs = 5; // Default size if no argument is supplied

        // Check if a command-line argument was provided to override the size
        if (args.length > 0) {
            try {
                maxInputs = Integer.parseInt(args[0]);

                if (maxInputs <= 0) {
                    System.out.println("Invalid size. Using default size of 10.");
                    maxInputs = 10;
                }
            } catch (NumberFormatException e) {
                System.out.println("Argument must be an integer. Using default size of 10.");
                maxInputs = 10;
            }
        }

        // Allocate the smallest possible array based on the dynamic command-line size
        int[] uniqueNumbers = new int[maxInputs];
        int uniqueCount = 0;

        System.out.printf("Array allocated for up to %d inputs. Enter numbers between 10 and 100 inclusive:%n%n",
                maxInputs);

        for (int i = 0; i < maxInputs; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            int currentInput = input.nextInt();

            // Range validation check
            if (currentInput < 10 || currentInput > 100) {
                System.out.println("Out of bounds! Number must be between 10 and 100.");
                i--;
                continue;
            }

            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueNumbers[j] == currentInput) {
                    isDuplicate = true;
                    break;
                }
            }

            // Display and record item only if it is unique
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = currentInput;
                uniqueCount++;
                System.out.printf("Passed validation (Unique): %d%n", currentInput);
            } else {
                System.out.println("Duplicate entry ignored.");
            }

            // Complete output display of all unique values captured up to this point
            System.out.print("Current unique sequence: [ ");
            for (int j = 0; j < uniqueCount; j++) {
                System.out.print(uniqueNumbers[j] + " ");
            }
            System.out.println("]\n");
        }

        input.close();
    }
}
