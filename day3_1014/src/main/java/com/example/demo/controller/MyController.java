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
	
//	@GetMapping("/")
//	public String getMethodName() {
//		return myService.sayHello("안녕");
//	}
	@GetMapping("/ex328")
	public String ex328() {
		return myService.ex328();
	}
	@GetMapping("/ex331")
	public String ex331() {
		return myService.ex331();
	}
}