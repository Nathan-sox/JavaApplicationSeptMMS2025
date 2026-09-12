import java.io.IOException;

class ExceptionA extends Exception {
}

class ExceptionB extends ExceptionA {
}

public class CatchAllExceptionTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            try {
                if (i == 1)
                    throw new ExceptionA();
                if (i == 2)
                    throw new ExceptionB();
                if (i == 3)
                    throw new NullPointerException();
                if (i == 4)
                    throw new IOException();
            } catch (Exception exception) {
                System.out.println("Polymorphically caught exception of type: " + exception.getClass().getName());
            }
        }
    }
}
