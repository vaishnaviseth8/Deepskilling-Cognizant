package com.library.repository;

import com.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// EXERCISE 9: Inheriting JpaRepository functions for database interactions
public interface BookRepository extends JpaRepository<Book, Long> {

    // EXERCISE 1 & 5: Retaining original baseline verification routine logic
    default void saveData() {
        System.out.println("BookRepository [Legacy Call]: Book data trace processed successfully!");
    }
}