public class Rectangle {
    // Attributes with default values of 1.0
    private double length = 1.0;
    private double width = 1.0;

    // Default constructor
    public Rectangle() {
        // Attributes already use the default values above
    }

    // Set method for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length! Must be between 0.0 and 20.0.");
        }
    }

    // Get method for length
    public double getLength() {
        return length;
    }

    // Set method for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width! Must be between 0.0 and 20.0.");
        }
    }

    // Get method for width
    public double getWidth() {
        return width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}
