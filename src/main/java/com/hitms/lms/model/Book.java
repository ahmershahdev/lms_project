package com.hitms.lms.model;

/**
 * A book held in the library catalogue.
 */
public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private int availableCopies;

    /**
     * Creates a new book record.
     *
     * @param isbn unique ISBN of the book
     * @param title title of the book
     * @param author author of the book
     * @param availableCopies number of copies on the shelf
     */
    public Book(String isbn, String title, String author, int availableCopies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString() {
        return title + " by " + author + " [" + availableCopies + " available]";
    }
}
