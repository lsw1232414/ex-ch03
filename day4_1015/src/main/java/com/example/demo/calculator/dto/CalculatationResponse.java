package com.example.demo.calculator.dto;

public record CalculatationResponse( 
		double num1,
		double num2,
		String operation,
		String result) {

}
