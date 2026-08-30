public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle airplane = new Airplane();
        Vehicle bicycle = new Bicycle();

        System.out.println("Vehicle: " + vehicle.move());
        System.out.println("Car: " + car.move());
        System.out.println("Airplane: " + airplane.move());
        System.out.println("Bicycle: " + bicycle.move());

    }
}
