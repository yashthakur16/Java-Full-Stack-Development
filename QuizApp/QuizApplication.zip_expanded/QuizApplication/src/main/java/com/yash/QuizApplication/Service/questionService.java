package com.yash.QuizApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.QuizApplication.Dao.QuestionDao;
import com.yash.QuizApplication.model.question;


@Service
public class questionService {

	@Autowired
	QuestionDao dao;
	
	
	public List<question> getAllQuestions() 
	{
		return dao.findAll();
		
	}


	public List<question> levelQuestion(String level) {
		return dao.findBydifficultyLevel(level);
	}


	public void addQuestion(question p) {
		dao.save(p);
		
		return ;
		
	}

}
