public class Calculator {
    public static int calculate(int a, int b) {
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    // The string doesnt matter it's just used to override for multiplication
    public static int calculate(int a, int b, String mult) {
        return a * b;
    }

}