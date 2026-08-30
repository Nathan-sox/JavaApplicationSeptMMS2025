public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "No title, Please set the title";
        this.author = "No author, Please set the author";
        this.price = 0.0;

    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}