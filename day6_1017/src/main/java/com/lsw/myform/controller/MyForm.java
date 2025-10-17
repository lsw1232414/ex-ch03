package com.lsw.myform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lsw.myform.dto.ArticleRequest;

@RestController
public class MyForm {
//	http://localhost:8080/article-get?title=제목&contetn=내용
	@GetMapping("/article-get")
	private String ariticleGet(@RequestParam String title, @RequestParam String content) {
		String result = "제목: " + title + "<br>내용: " + content;
	return result;
	}
//	http://localhost:8080/article-post
	@PostMapping("/article-post")
	public String articlePost(@ModelAttribute ArticleRequest request) {
		String result = "제목: " + request.title() + "<br>내용:" + request.content();
		return result;
		
	}
//	포스트맨으로 테스트하세요 {"title" : "제목", "content" : "내용" }
	@PostMapping("/article-postman")
	public String articlePostman(@RequestBody ArticleRequest request) {
		String result = "제목: " + request.title() +"\n"+ "내용: " + request.content();
		return result;
	}
	
	@PostMapping("/article-auto")
	public String articleAuto(ArticleRequest request) {
		String result = "제목: " + request.title() +"\n"+ "내용: " + request.content();
		return result;
	}
}
	