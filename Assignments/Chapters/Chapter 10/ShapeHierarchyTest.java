abstract class Shape {
    @Override
    public abstract String toString();
}

abstract class TwoDimensionalShape extends Shape {
    public abstract double getArea();
}

abstract class ThreeDimensionalShape extends Shape {
    public abstract double getArea();

    public abstract double getVolume();
}

class Circle extends TwoDimensionalShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius %.2f", radius);
    }
}

class Square extends TwoDimensionalShape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Square with side %.2f", side);
    }
}

class Sphere extends ThreeDimensionalShape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return String.format("Sphere with radius %.2f", radius);
    }
}

class Cube extends ThreeDimensionalShape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("Cube with side %.2f", side);
    }
}

public class ShapeHierarchyTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Square(5.0);
        shapes[2] = new Sphere(4.0);
        shapes[3] = new Cube(3.0);

        for (Shape currentShape : shapes) {
            System.out.println("Shape Description: " + currentShape);

            if (currentShape instanceof TwoDimensionalShape) {
                TwoDimensionalShape d2 = (TwoDimensionalShape) currentShape;
                System.out.printf("  Type: Two-Dimensional%n");
                System.out.printf("  Area: %.2f%n", d2.getArea());
            } else if (currentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape d3 = (ThreeDimensionalShape) currentShape;
                System.out.printf("  Type: Three-Dimensional%n");
                System.out.printf("  Surface Area: %.2f%n", d3.getArea());
                System.out.printf("  Volume:       %.2f%n", d3.getVolume());
            }
            System.out.println();
        }
    }
}
