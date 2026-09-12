class ExceptionA extends Exception {
}

class ExceptionB extends ExceptionA {
}

public class CatchOrderErrorDemo {
    public static void main(String[] args) {
        try {
            throw new ExceptionB();
        } catch (ExceptionA a) {
            System.out.println("Caught ExceptionA");
        }
    }
}
