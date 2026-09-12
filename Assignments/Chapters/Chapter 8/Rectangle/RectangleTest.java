public class RectangleTest {
    public static void main(String[] args) {
        // Create a new rectangle object
        Rectangle myRectangle = new Rectangle();

        // Display default values
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
        System.out.println("Area: " + myRectangle.calculateArea());

        System.out.println("\nChanging values to valid numbers (5.5 and 10.2)...");
        myRectangle.setLength(5.5);
        myRectangle.setWidth(10.2);

        // Display updated values
        System.out.println("Updated Rectangle:");
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
        System.out.println("Area: " + myRectangle.calculateArea());

        System.out.println("\nTesting invalid values (25.0)...");
        myRectangle.setLength(25.0); // This will trigger the error message
    }
}
