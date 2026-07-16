package com.library.service;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private BookRepository setterRepository;

    // EXERCISE 7 & 9: Constructor Injection automatically processed by Spring Boot Core
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // EXERCISE 2 & 5: Setter Method mapping traditional container target definitions
    @Autowired
    public void setSetterRepository(BookRepository setterRepository) {
        this.setterRepository = setterRepository;
    }

    // EXERCISE 9: Business logic to fetch books from database
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // EXERCISE 9: Business logic to save a new book to database
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void manageBooks() {
        System.out.println("BookService: Running application validation protocols...");

        // EXERCISE 7 Verification Engine check
        if (this.bookRepository != null) {
            System.out.print("[Exercise 7 & 9 - Constructor Injection Verified] -> ");
            this.bookRepository.saveData();
        }

        // EXERCISE 2 & 5 Verification Engine check
        if (this.setterRepository != null) {
            System.out.print("[Exercise 2 & 5 - Setter Injection Verified] -> ");
            this.setterRepository.saveData();
        }
    }
}