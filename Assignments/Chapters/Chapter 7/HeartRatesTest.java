import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter date of birth details:");
        System.out.print("  Month (1-12): ");
        int month = input.nextInt();

        System.out.print("  Day (1-31): ");
        int day = input.nextInt();

        System.out.print("  Year (e.g., 1995): ");
        int year = input.nextInt();

        // Instantiate HeartRates object
        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        // Display reports
        System.out.println("\n========================================");
        System.out.println("         HEART RATE REPORT              ");
        System.out.println("========================================");
        System.out.printf("First Name:         %s%n", person.getFirstName());
        System.out.printf("Last Name:          %s%n", person.getLastName());
        System.out.printf("Date of Birth:      %02d/%02d/%d%n",
                person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
        System.out.printf("Age:                %d years old%n", person.getAge());
        System.out.printf("Max Heart Rate:     %d bpm%n", person.getMaxHeartRate());
        System.out.printf("Target Heart Rate:  %s%n", person.getTargetHeartRateRange());
        System.out.println("========================================");

        input.close();
    }
}
