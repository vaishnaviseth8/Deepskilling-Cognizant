package com.library;

import com.library.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {
    public static void main(String[] args) {
        // EXERCISE 9: Launching application container ecosystem via SpringBoot bootstrap engine
        ApplicationContext context = SpringApplication.run(LibraryManagementApplication.class, args);

        // EXERCISE 1, 2, 5, 7 Legacy integration operational check logic
        BookService bookService = context.getBean(BookService.class);
        bookService.manageBooks();
    }
}