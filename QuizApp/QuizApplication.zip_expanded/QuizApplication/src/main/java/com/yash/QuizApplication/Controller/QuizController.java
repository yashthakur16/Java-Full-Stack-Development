package com.yash.QuizApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.QuizApplication.Service.questionService;
import com.yash.QuizApplication.model.question;

@RestController
@RequestMapping("question")
public class QuizController 
{
	
	@Autowired
	questionService qs;
	
	@GetMapping("allQuestions")
	public ResponseEntity< List<question>> getAllQuestions()
	{
		return qs.getAllQuestions();
	}
	
	@GetMapping("allQuestions/{level}")
	public ResponseEntity< List<question>>levelQuestion(@PathVariable String level)
	{
		return qs.levelQuestion(level);
	}
	
	@PostMapping("addQuestion")
	public ResponseEntity< String> addQuestion(@RequestBody question p)
	{
		return qs.addQuestion(p);
		
	}

}
