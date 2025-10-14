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
	@GetMapping("/ex324")
	public String ex324() {
		return myService.ex324();
	}
	@GetMapping("/ex325")
	public String ex325() {
		return myService.ex325();
	}
	@GetMapping("/ex326")
	public String ex326() {
		return myService.ex326();
	}
	@GetMapping("/ex327")
	public String ex327() {
		return myService.ex327();
	}
	
	@GetMapping("/ex328")
	public String ex328() {
		return myService.ex328();
	}
	@GetMapping("/ex331")
	public String ex331() {
		return myService.ex331();
	}
}