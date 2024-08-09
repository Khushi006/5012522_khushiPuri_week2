package com.example.librarymanagement;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    // Dummy method to simulate saving a book
    public void save(Book book) {
        System.out.println("Saving book: " + book.getTitle());
    }

    // Dummy method to simulate finding a book by ID
    public Book findById(String id) {
        return new Book(id, "Sample Book");
    }
}
