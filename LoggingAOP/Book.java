package com.example.librarymanagement;

public class Book {
    private String id;
    private String title;

    // Constructors, getters, and setters

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
