public class App {
    public static void main(String[] args) throws Exception {
        Librarian femil = new Librarian("Femil");

        Book.addBook("Chronicles of Fih", "Chronicles of Fih", "The Fih Massuer");
        Book.addBook("Treaty of the Dead", "Treaty of the Dead", "Le Charles de Fan");
        Book.addBook("Jacob Silver's Lost Coin", "Jacob Silver's Lost Coin", "Trean Ancover");

        femil.registerMember("Nathan", 22, "2026-09-11");
        femil.registerMember("Amara", 25, "2026-09-11");

        System.out.println("Registered members:");
        Member.displayMembers();

        System.out.println("Available books:");
        Book.displayBooks();

        System.out.println("Borrowing Chronicles of Fih:");
        Book.borrowBook("Chronicles of Fih");
        Book.displayBooks();

        System.out.println("Returning Chronicles of Fih:");
        Book.returnBook("Chronicles of Fih");
        Book.displayBooks();
    }
}
