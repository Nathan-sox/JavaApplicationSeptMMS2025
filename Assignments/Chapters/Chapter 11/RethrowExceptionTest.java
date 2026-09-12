public class RethrowExceptionTest {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Main caught the rethrown exception.");
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("someMethod caught exception. Rethrowing now...");
            throw e;
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Original exception from someMethod2");
    }
}
