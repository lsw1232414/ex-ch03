package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam( "name")String name) {
		return "hello" + name;
		
	}
	@GetMapping("/hello2")
	public String hello2(@RequestParam( "name")String name) {
		return "hello2" + name;
	}
	@GetMapping("/hello3")
	public String hello3(@RequestParam( "name")String name) {
		return "hello3" + name;
	
	
		
	}

}
