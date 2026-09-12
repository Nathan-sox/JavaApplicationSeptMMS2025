class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

public class ExceptionHierarchyTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("ExceptionB occurred!");
        } catch (ExceptionA e) {
            System.out.println("Caught via superclass ExceptionA: " + e.getMessage());
        }

        try {
            throw new ExceptionC("ExceptionC occurred!");
        } catch (ExceptionA e) {
            System.out.println("Caught via superclass ExceptionA: " + e.getMessage());
        }
    }
}
