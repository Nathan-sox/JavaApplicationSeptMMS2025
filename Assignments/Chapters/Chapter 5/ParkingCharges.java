import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        // Scanner Object 1
        Scanner scanner = new Scanner(System.in);

        // The current Time
        LocalDateTime timeParkedToday = LocalDateTime.now();

        // The Formatter Object used
        DateTimeFormatter formatter_time = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Prompts the user for the timeParkedYesterday
        System.out.print("Time Parked Yesterday(HH:mm:ss): ");
        String timeParkedYesterday_str = scanner.nextLine();
        LocalTime timeParkedYesterday_time = LocalTime.parse(timeParkedYesterday_str, formatter_time);

        // Adds a Date to the timeParkedYesterday
        LocalDateTime timeParkedYesterday_DateTime = LocalDateTime.of(timeParkedToday.toLocalDate().minusDays(1),
                timeParkedYesterday_time);

        // Calculates the duration in Hours between the timeParkedYesterday and the
        // timeParkedToday
        Duration duration = Duration.between(timeParkedYesterday_DateTime, timeParkedToday);
        long durationInMinutes = duration.toMinutes();
        long durationInHoursRounded = (durationInMinutes + 59) / 60;

        // Calculates the fee to pay
        double feeToPay = calculateFee(durationInHoursRounded);

        // Final Output
        System.out.printf("Hours In Between: %d %n", durationInHoursRounded);
        System.out.printf("The fee to pay is: $%.2f", feeToPay);

        // Close scanner object
        scanner.close();
    }

    public static double calculateFee(long numberOfHours) {
        // Base Variables needed
        double finalFee;
        double baseCharge = 2.0;
        double maxCharge = 10.0;
        double maxHours = 24;
        long hoursSpentExtra = 0;

        // Checks some conditions before Calculating the final fee
        if (numberOfHours <= 3) {
            finalFee = 2.0;
        } else if (numberOfHours >= maxHours) {
            finalFee = maxCharge;
        } else {
            hoursSpentExtra = numberOfHours - 3;
            finalFee = baseCharge + (hoursSpentExtra * 0.5);
        }

        // System.out.printf("Additional Hours: %d %n", hoursSpentExtra);

        return finalFee;
    }
}