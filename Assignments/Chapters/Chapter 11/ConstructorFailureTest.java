class SomeClass {
    public SomeClass() throws Exception {
        System.out.println("Initializing SomeClass object...");
        throw new Exception("Constructor failed to initialize object safely.");
    }
}

public class ConstructorFailureTest {
    public static void main(String[] args) {
        try {
            SomeClass myObject = new SomeClass();
        } catch (Exception e) {
            System.out.println("Handled constructor failure: " + e.getMessage());
        }
    }
}
