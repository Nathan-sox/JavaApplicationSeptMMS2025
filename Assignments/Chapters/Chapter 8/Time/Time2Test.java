package Time;

public class Time2Test {
    public static void main(String[] args) {
        // Instantiate using different constructors
        Time2 t1 = new Time2();             // 00:00:00
        Time2 t2 = new Time2(13);           // 13:00:00
        Time2 t3 = new Time2(13, 45);       // 13:45:00
        Time2 t4 = new Time2(13, 45, 30);   // 13:45:30

        System.out.println("Initial universal times:");
        System.out.println("t1: " + t1.toUniversalString());
        System.out.println("t4: " + t4.toUniversalString());

        System.out.println("\nInitial standard times:");
        System.out.println("t4: " + t4.toString());

        // Modify individual values using set methods
        System.out.println("\nChanging t4 seconds to 59 and hour to 8...");
        t4.setSecond(59);
        t4.setHour(8);

        System.out.println("Updated t4 (Universal): " + t4.toUniversalString());
        System.out.println("Updated t4 (Standard):  " + t4.toString());
    }
}

