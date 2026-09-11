import java.util.ArrayList;

public class Book {
    private String bookName;
    private String bookTitle;
    private String bookAuthor;

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Book(String bookName, String bookTitle, String bookAuthor){
        this.bookName = bookName;
        this. bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    static void addBook(String newBookName, String newBookTitle, String newBookAuthor){
        books.add(new Book(newBookName, newBookTitle, newBookAuthor));
    }

    static void displayBooks(){
        for(Book book : books){
            System.out.printf("Book Name: " + book.bookName 
            + "%nBook Title: " +book.bookTitle 
            + "%nBook Author: " + book.bookAuthor);
            System.out.println();
        }
    }

    // Return and borrow books
    static void borrowBook(String name){
        int i = 0;
        for(Book book : books){
            if(book.bookName.equals(name)){
                borrowedBooks.add(book);
                books.remove(i);
                return;
            }
            i++;
        }
        System.out.println("Book not found: " + name);
    }

    static void returnBook(String name){
        int i = 0;
        for(Book borrowedBook : borrowedBooks){
            if(borrowedBook.bookName.equals(name)){
                books.add(borrowedBook);
                borrowedBooks.remove(i);
                return;
            }
            i++;
        }

        System.out.println("Book not found in borrowed books.");
    }

}
