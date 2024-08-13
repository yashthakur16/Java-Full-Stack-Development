package com.yash.QuizApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.QuizApplication.Service.QuizService;
import com.yash.QuizApplication.model.QuestionWrapper;
import com.yash.QuizApplication.model.Quiz;
import com.yash.QuizApplication.model.Response;

@RestController
@RequestMapping("quiz")
public class QController 
{
	@Autowired
	QuizService qs;
	
	@PostMapping("create")
	public ResponseEntity<String> create(@RequestParam String level, @RequestParam int numQ, @RequestParam String title)
	{
		return qs.create(level,numQ,title);
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> get(@PathVariable int id)
	{
		return qs.get(id);
	}
	
	@PostMapping("submit/{id}")
	public ResponseEntity<Integer> submit(@PathVariable int id,@RequestBody  List<Response> responses)
	{
		return qs.result(id,responses);
	}
	
}
