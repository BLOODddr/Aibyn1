package org.libr.library;

import org.libr.library.models.Book;
import org.libr.library.models.User;
import org.libr.library.models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books;
    private List<User> users;
    private List<Transaction> transactions;

    public LibraryManager() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Add user
    public void addUser(User user) {
        users.add(user);
    }

    // Add transaction
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // List all books
    public void listBooks() {
        books.forEach(System.out::println);
    }

    // List all users
    public void listUsers() {
        users.forEach(System.out::println);
    }

    // List all transactions
    public void listTransactions() {
        transactions.forEach(System.out::println);
    }
}
