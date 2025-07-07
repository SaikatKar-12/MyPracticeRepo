package com.Saikat.LibraryManagement.library.service;

import com.Saikat.LibraryManagement.library.repository.BookRepository;

/**
 * Service class for managing book-related operations
 */
public class BookService {
    
    private BookRepository bookRepository;
    
    // Default constructor for XML configuration
    public BookService() {
    }
    
    // Constructor injection for XML configuration
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // Setter injection for XML configuration
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    /**
     * Get the book repository instance
     * @return BookRepository instance
     */
    public BookRepository getBookRepository() {
        return bookRepository;
    }
    
    /**
     * Add a book to the library
     * @param book The book to add
     */
    public void addBook(String book) {
        if (bookRepository != null) {
            bookRepository.save(book);
        }
    }
    
    /**
     * Find a book by title
     * @param title The title to search for
     * @return The found book or null if not found
     */
    public String findBook(String title) {
        if (bookRepository != null) {
            return bookRepository.findByTitle(title);
        }
        return null;
    }
    
    /**
     * Get all books
     * @return Array of all books
     */
    public String[] getAllBooks() {
        if (bookRepository != null) {
            return bookRepository.findAll();
        }
        return new String[0];
    }
} 