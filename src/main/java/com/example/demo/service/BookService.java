package com.example.demo.service;


import java.awt.print.Book;
import java.util.List;


import com.example.demo.reposiratory.BookRepository;


public class BookService {
    private BookRepository bookRepository;

    // Constructor to initialize the repository
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to find all books
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    // Method to find a book by ID
    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Method to create a new book
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    // Method to delete a book by ID
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
