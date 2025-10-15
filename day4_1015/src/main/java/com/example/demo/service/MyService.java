package com.example.demo.service;

import java.util.Optional;

import com.example.demo.controller.MyController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);

    
public String ex3312() {
    	Optional<String> isThisNull = Optional.ofNullable("public static void");
    	
    	isThisNull.ifPresent(str -> System.out.println(str.toUpperCase()));
    	
    	return "콘솔 출력";
    }
public String ex521() {
			return "Hello";
		}
	
}

