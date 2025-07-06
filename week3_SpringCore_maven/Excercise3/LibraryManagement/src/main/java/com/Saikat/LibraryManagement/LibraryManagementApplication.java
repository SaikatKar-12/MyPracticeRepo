package com.Saikat.LibraryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.ConfigurableApplicationContext;
import com.Saikat.LibraryManagement.library.service.BookService;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class LibraryManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LibraryManagementApplication.class, args);
		
		// Test the logging aspect by calling methods
		BookService bookService = context.getBean(BookService.class);
		
		System.out.println("=== Testing Logging Aspect ===");
		bookService.addBook("The Great Gatsby");
		bookService.findBook("The Great Gatsby");
		bookService.getAllBooks();
		System.out.println("=== Logging Aspect Test Complete ===");
	}

}
