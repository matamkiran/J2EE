package com.example.postgresdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Answer;
import com.example.postgresdemo.service.IAnswerService;

@RestController
public class AController {
	
	@Autowired
	private IAnswerService iAnswerService;
	
	@GetMapping("/my/answers")
	public List<Answer> getAnswers(){ 
		return iAnswerService.fetchAnswerslist();
			  
			 }
	/*
	 * @GetMapping("/my/answers") public List<Answer> getAnswers{ return
	 * iAnswerService.fetchAnswerslist();
	 * 
	 * }
	 */

}
