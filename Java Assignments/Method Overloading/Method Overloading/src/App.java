
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Double Addition: " + Calculator.calculate(2.5, 5.4));
        System.out.println("Integer Addition(2 integers): " + Calculator.calculate(3, 5));
        System.out.println("Integer Addition(3 Integers): " + Calculator.calculate(4, 8, 5));
        System.out.println("Integer Multiplication(2 Integers): " + Calculator.calculate(4, 3, "*"));
        System.out.println("Note that the program only support multiplication of 2 integers.");
    }
}
