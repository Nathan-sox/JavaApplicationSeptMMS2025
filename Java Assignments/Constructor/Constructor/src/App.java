public class App {
    public static void main(String[] args) throws Exception {
        Book book1 = new Book();
        Book book2 = new Book("The conqueror's regret", "Jacob Salem", 30.0);

        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
    }
}
