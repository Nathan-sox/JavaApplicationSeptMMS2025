public class App {
    public static void main(String[] args) throws Exception {
        Engine engine = new Engine("Yamaha 9250GT", 250, 6);
        Car car = new Car("Camry", "Red", 25300.99, engine);

        System.out.println(car.getCarDetails());
    }
}
