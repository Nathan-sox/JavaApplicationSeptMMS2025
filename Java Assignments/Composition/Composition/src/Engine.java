public class Engine {
    private String name;
    private double horsePower;
    private int cylinders;

    public Engine(String name, double horsePower, int cylinders) {
        this.name = name;
        this.horsePower = horsePower;
        this.cylinders = cylinders;
    }

    public String toString() {
        return name + " " + horsePower + "HP " + cylinders + " cylinders";
    }
}
