package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	String username;

	public void sendEmail() {

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("vovav900@gmail.com");
		msg.setFrom(username);

		msg.setSubject("Проверка");
		msg.setText("Hello World \n Spring Boot Email");

		javaMailSender.send(msg);

	}
}
