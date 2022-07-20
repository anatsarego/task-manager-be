package com.anatsarego.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TaskManagerBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerBeApplication.class, args);
	}
	
	@GetMapping("/greet")
	public String helloGreeting() {
		return "Hello REST";
	}
	
	

}
