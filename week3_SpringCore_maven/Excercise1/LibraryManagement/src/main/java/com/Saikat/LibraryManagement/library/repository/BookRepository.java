package com.Saikat.LibraryManagement.library.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository class for managing book data
 */
public class BookRepository {
    
    private List<String> books;
    
    public BookRepository() {
        this.books = new ArrayList<>();
        // Initialize with some sample books
        books.add("The Great Gatsby");
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("Pride and Prejudice");
    }
    
    /**
     * Save a book to the repository
     * @param book The book to save
     */
    public void save(String book) {
        if (book != null && !book.trim().isEmpty()) {
            books.add(book);
        }
    }
    
    /**
     * Find a book by title
     * @param title The title to search for
     * @return The found book or null if not found
     */
    public String findByTitle(String title) {
        if (title != null) {
            for (String book : books) {
                if (book.equalsIgnoreCase(title)) {
                    return book;
                }
            }
        }
        return null;
    }
    
    /**
     * Get all books
     * @return Array of all books
     */
    public String[] findAll() {
        return books.toArray(new String[0]);
    }
    
    /**
     * Get the list of books
     * @return List of books
     */
    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
    
    /**
     * Set the list of books
     * @param books The list of books to set
     */
    public void setBooks(List<String> books) {
        this.books = books != null ? new ArrayList<>(books) : new ArrayList<>();
    }
    
    /**
     * Get the number of books in the repository
     * @return The number of books
     */
    public int getBookCount() {
        return books.size();
    }
} 