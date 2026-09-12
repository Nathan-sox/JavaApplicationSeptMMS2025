import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // One-dimensional array to store counters for 9 salary ranges
        // Index 0 corresponds to $200-299, Index 8 corresponds to $1000 and over
        int[] salaryCounters = new int[9];

        System.out.println("Enter salesperson gross sales (-1 to end): ");
        double grossSales = input.nextDouble();

        while (grossSales != -1) {
            // Calculate total earnings: $200 base salary + 9% of gross sales
            int totalSalary = (int) (200 + (0.09 * grossSales));
            System.out.printf("Total earnings: $%d%n", totalSalary);

            // Determine the correct array index based on earnings
            int rangeIndex = (totalSalary - 200) / 100;

            // Cap the index at 8 for salaries $1,000 and over
            if (rangeIndex > 8) {
                rangeIndex = 8;
            }

            // Increment the counter if the salary is within a valid range ($200+)
            if (rangeIndex >= 0) {
                salaryCounters[rangeIndex]++;
            } else {
                System.out.println("Invalid sales amount entered.");
            }

            System.out.println("\nEnter salesperson gross sales (-1 to end): ");
            grossSales = input.nextDouble();
        }

        // Display results in a tabular format
        System.out.println("\nSalary Range\tTotal Salespeople");
        System.out.println("=================================");

        for (int i = 0; i < salaryCounters.length; i++) {
            if (i == 8) {
                System.out.printf("$1,000 and over\t%d%n", salaryCounters[i]);
            } else {
                int lowerBound = 200 + (i * 100);
                int upperBound = lowerBound + 99;
                System.out.printf("$%d - $%d\t%d%n", lowerBound, upperBound, salaryCounters[i]);
            }
        }

        input.close();
    }
}