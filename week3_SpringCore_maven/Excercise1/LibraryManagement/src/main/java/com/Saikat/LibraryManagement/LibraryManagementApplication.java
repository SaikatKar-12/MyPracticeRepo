package com.Saikat.LibraryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class LibraryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

}
