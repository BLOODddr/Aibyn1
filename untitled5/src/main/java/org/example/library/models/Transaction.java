package org.libr.library.models;

import java.util.Objects;

public class Transaction {
    private int transactionId;
    private int bookId;
    private int userId;
    private String transactionType; // borrow or return
    private String transactionDate;

    // Constructor
    public Transaction(int transactionId, int bookId, int userId, String transactionType, String transactionDate) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.userId = userId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
    }

    // Getters and Setters
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    // toString Method
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", bookId=" + bookId +
                ", userId=" + userId +
                ", transactionType='" + transactionType + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                '}';
    }

    // equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return transactionId == that.transactionId &&
                bookId == that.bookId &&
                userId == that.userId &&
                transactionType.equals(that.transactionType) &&
                transactionDate.equals(that.transactionDate);
    }

    // hashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(transactionId, bookId, userId, transactionType, transactionDate);
    }
}
