package com.gymmanager.ruby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gymmanager.ruby.model.person.RegistrationPerson;

@SpringBootApplication
public class RubyApplication {

	public static void main(String[] args) {

		SpringApplication.run(RubyApplication.class, args);
	}


}
