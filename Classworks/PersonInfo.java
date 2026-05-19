import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.println("\n--- Person Information ---");
        System.out.printf("Name:    %s%n", name);
        System.out.printf("Age:     %d%n", age);
        System.out.printf("Address: %s%n", address);
    }
}