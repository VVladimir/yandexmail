package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.MailService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	MailService service;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending Email...");

		service.sendEmail();

		System.out.println("Done");
	}

}
