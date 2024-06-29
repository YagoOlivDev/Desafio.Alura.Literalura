package com.example.Library;

import com.example.Library.Principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LibreraryApplication implements CommandLineRunner {

	@Autowired
	private Principal Principal;

	public LibreraryApplication(Principal principal) {
		this.Principal = principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(LibreraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal.executar();
	}
}