package com.yash.QuizApplication.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yash.QuizApplication.Dao.QuestionDao;
import com.yash.QuizApplication.model.question;


@Service
public class questionService {

	@Autowired
	QuestionDao dao;
	
	
	public ResponseEntity< List<question>> getAllQuestions() 
	{
		try
		{
			return new ResponseEntity<>(dao.findAll(),HttpStatus.OK) ;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
		
	}


	public ResponseEntity< List<question>> levelQuestion(String level) {
		try
		{
			return new ResponseEntity<> (dao.findBydifficultyLevel(level),HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
		
	}


	public ResponseEntity<String> addQuestion(question p) {
		dao.save(p);
		
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
		
	}

}
