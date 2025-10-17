package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExbgApplication {
	
	Logger log = LoggerFactory.getLogger(ExbgApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ExbgApplication.class, args);
	}
	
	//java방식 new키워드를 통해서 객체를 생성하는방식
	//Test test = new Test();
	
	@Bean
	public CommandLineRunner run() {
		return args -> {
			log.info("====================");
			log.debug("디버그");
			log.warn("경고");
			log.error("에러");
		};
	}

}
