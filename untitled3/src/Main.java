import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, "John Doe", "johndoe@example.com");
        Book book = new Book(1, "Java Programming", "John Smith", true);
        LibraryManager libraryManager = new LibraryManager();

        // Borrow a book
        libraryManager.borrowBook(user, book);

        // Return the book
        libraryManager.returnBook(user, book);
    }
}