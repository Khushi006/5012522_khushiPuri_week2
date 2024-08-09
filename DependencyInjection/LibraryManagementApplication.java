package com.example.librarymanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            BookService bookService = ctx.getBean(BookService.class);

            Book book = new Book("1", "Spring Framework");
            bookService.addBook(Book);

            Book retrievedBook = bookService.getBook("1");
            System.out.println("Retrieved Book: " + retrievedBook.getTitle());
        };
    }
}
