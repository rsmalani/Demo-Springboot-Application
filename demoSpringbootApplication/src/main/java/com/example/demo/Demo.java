package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// The Demo class of the is used as a Rest controller.
@SpringBootApplication
@RestController
public class Demo {

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}

	/*	When the local host is prodded with '/greet' then we invoke the following method.
		It returns "Hello" greetings to the user/client  */
	@GetMapping("/greet")
	public String greet() {
		return "Hello";
	}

}
