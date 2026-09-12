// 1. THE DATE CLASS
class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", month, day, year);
    }
}

abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final Date birthDate;

    public Employee(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s (Birthday: %s)", firstName, lastName, birthDate);
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, Date birthDate, double weeklySalary) {
        super(firstName, lastName, birthDate);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s", super.toString());
    }
}

public class PayrollSystemTest {
    public static void main(String[] args) {
        // Assume current processing month is September (Month 9)
        int currentMonth = 9;

        // Create an array of Employee variables
        Employee[] employees = new Employee[2];

        // Employee 1: Birthday is in September (Eligible for bonus)
        employees[0] = new SalariedEmployee("Alice", "Smith", new Date(9, 15, 1995), 800.00);

        // Employee 2: Birthday is in June (Not eligible for bonus)
        employees[1] = new SalariedEmployee("Bob", "Jones", new Date(6, 22, 1992), 950.00);

        System.out.println("Processing Payroll for Month: " + currentMonth + "\n");

        // Loop through array and calculate payroll polymorphically
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            double baseEarnings = currentEmployee.earnings();
            double totalEarnings = baseEarnings;

            // Check if it is the employee's birthday month
            if (currentEmployee.getBirthDate().getMonth() == currentMonth) {
                totalEarnings += 100.00;
                System.out.printf("  ** Happy Birthday Bonus Added: +$100.00 **%n");
            }

            System.out.printf("  Base Earnings: $%.2f%n", baseEarnings);
            System.out.printf("  Total Payout:  $%.2f%n%n", totalEarnings);
        }
    }
}
