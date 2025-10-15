package com.example.demo.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.calculator.dto.CalculatationResponse;
import com.example.demo.calculator.dto.CalcutaionRequest;
import com.example.demo.calculator.service.CalculatorService;


@RestController
@RequestMapping("calculator")
public class CalculatorController {
//	사용법1: Autowired 어노테이션을 사용하는 방법	
//	@Autowired

//  사용법2: 생성자를 사용하는 방법: 객체 OBJ
	CalculatorService calculatorService;
	
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;  
	}
	@PostMapping("/calculate")
	public CalculatationResponse calculate(@RequestBody CalcutaionRequest request) {
		String result = calculatorService.calculate(request.getNum1(), request.getNum2(), request.getOperation());
		
		return new CalculatationResponse(request.getNum1(),request.getNum2(),request.getOperation(), result);
//		return "test";
		
	}
//	http://localhost:8080/calculator/add?num1=10&num2=1
	
	@GetMapping("/add")
    public CalculatationResponse add(@RequestParam double num1, @RequestParam double num2) {
        String result = calculatorService.add(num1, num2);
        return new CalculatationResponse(num1, num2, "ADD", result);
    }
//	http://localhost:8080/calculator/subtract?num1=10&num2=1
    @GetMapping("/subtract")
    public CalculatationResponse subtract(@RequestParam double num1, @RequestParam double num2) {
        String result = calculatorService.subtract(num1, num2);
        return new CalculatationResponse(num1, num2, "SUBTRACT", result);
    }
//  http://localhost:8080/calculator/multiply?num1=10&num2=1
    @GetMapping("/multiply")
    public CalculatationResponse multiply(@RequestParam double num1, @RequestParam double num2) {
        String result = calculatorService.multiply(num1, num2);
        return new CalculatationResponse(num1, num2, "MULTIPLY", result);
    }
//  http://localhost:8080/calculator/divide?num1=10&num2=1
    @GetMapping("/divide")
    public CalculatationResponse divide(@RequestParam double num1, @RequestParam double num2) {
        String result = calculatorService.divide(num1, num2);
        return new CalculatationResponse(num1, num2, "DIVIDE", result);
    }
}
