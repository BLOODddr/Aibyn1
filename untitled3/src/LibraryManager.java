import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryManager {

    public void borrowBook(User user, Book book) {
        if (book.isAvailable()) {
            try (Connection conn = DatabaseConnection.getConnection()) {
                String query = "INSERT INTO transactions (user_id, book_id, borrow_date) VALUES (?, ?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setInt(1, user.getUserId());
                    stmt.setInt(2, book.getBookId());
                    stmt.setDate(3, Date.valueOf(LocalDate.now()));
                    stmt.executeUpdate();

                    book.setAvailable(false);
                    System.out.println("Book borrowed successfully!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void returnBook(User user, Book book) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "UPDATE transactions SET return_date = ? WHERE user_id = ? AND book_id = ? AND return_date IS NULL";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setDate(1, Date.valueOf(LocalDate.now()));
                stmt.setInt(2, user.getUserId());
                stmt.setInt(3, book.getBookId());
                stmt.executeUpdate();

                long daysLate = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().plusDays(7)); // Assuming 7 days is the limit for borrowing
                if (daysLate > 0) {
                    System.out.println("Late fee: " + (daysLate * 2) + " USD");
                }
                book.setAvailable(true);
                System.out.println("Book returned successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
