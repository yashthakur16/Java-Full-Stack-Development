package com.yash.quiz_service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yash.quiz_service.Dao.Quizdao;
import com.yash.quiz_service.model.QuestionWrapper;
import com.yash.quiz_service.model.Quiz;
import com.yash.quiz_service.model.Response;
import com.yash.quiz_service.model.question;

@Service
public class QuizService 
{
	@Autowired
	Quizdao quizdao;
	

//	public ResponseEntity<String> create(String level, int numQ, String title) {
//		Quiz q=new Quiz();
//		q.setTitle(title);
//		List<question> questions=questiondao.getRandom(level,numQ);
//		q.setQuestions(questions);
//		quizdao.save(q);
//		return new ResponseEntity<>("Success",HttpStatus.CREATED);
//	}

	public ResponseEntity<List<QuestionWrapper>> get(int id) {
		Optional<Quiz> quiz=quizdao.findById(id);
		List<question> questions=quiz.get().getQuestions();
		List<QuestionWrapper> questionForClient=new ArrayList<>(); 
		for (question q : questions) {
			QuestionWrapper qw=new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(),q.getOption4());
			questionForClient.add(qw);
		}
		return new ResponseEntity<> (questionForClient,HttpStatus.OK);
	}
	
	public ResponseEntity<Integer> result(int id, List<Response> responses)
	{
		Quiz quiz=quizdao.findById(id).get();
		List<question> questions=quiz.getQuestions();
		int right=0;
		int i=0;
		for (Response r : responses) 
		{
			if(r.getAnswer().equals(questions.get(i).getRightAnswer()))
			{
				right++;
			}
			i++;
			
		}
		return new ResponseEntity<>(right,HttpStatus.OK);
	}
	
	

	
}
