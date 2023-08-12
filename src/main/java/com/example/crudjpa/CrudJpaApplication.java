package com.example.crudjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class CrudJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudJpaApplication.class, args);
	}
	@GetMapping
	public Object hello(){
		return "go to /api/v1/client/";
	}

}
