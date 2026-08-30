public class Car {
    private Engine engine;
    private String carName;
    private String carColor;
    private double price;

    public Car(String name, String color, double price, Engine engine) {
        this.engine = engine;
        this.carName = name;
        this.carColor = color;
        this.price = price;
    }

    public String getCarDetails() {
        return carColor + " " + carName + " with a " + engine + " @ $" + price;
    }
}