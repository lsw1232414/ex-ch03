package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @RequestMapping("/")
    public String hello() {
        return "<Strong><h1>초 기 화 면</h1></Strong>";
    }
    @RequestMapping("/bye")
    public String bye() {
    	return "BYE";
    }
}