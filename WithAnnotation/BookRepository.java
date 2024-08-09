package com.example.librarymanagement;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public void save(Book book) {
        System.out.println("Saving book: " + book.getTitle());
    }

    public Book findById(String id) {
        return new Book(id, "Sample Book");
    }
}
