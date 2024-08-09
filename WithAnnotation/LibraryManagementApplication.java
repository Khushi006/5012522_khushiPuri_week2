package com.example.librarymanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean(BookService.class);

        Book book = new Book("1", "Spring Framework");
        bookService.addBook(book);

        Book retrievedBook = bookService.getBook("1");
        System.out.println("Retrieved Book: " + retrievedBook.getTitle());
    }
}
