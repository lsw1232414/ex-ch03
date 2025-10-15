package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MyController {
	
	private final MyService myService;
	
	public MyController(MyService myService) {
		this.myService = myService;
	}
	@GetMapping("/ex3312")
	public String ex3311() {
		return myService.ex3312();
	}

	
}