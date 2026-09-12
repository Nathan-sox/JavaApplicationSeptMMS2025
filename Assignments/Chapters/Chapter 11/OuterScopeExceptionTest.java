public class OuterScopeExceptionTest {
    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (ArithmeticException e) {
            System.out.println("Main method outer scope caught: " + e.getMessage());
        }
    }

    public static void riskyMethod() {
        try {
            System.out.println("Inside inner method scope...");
            int result = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println("This inner block handles NullPointerExceptions only.");
        }
        System.out.println("This point is never reached because the math error escapes.");
    }
}
