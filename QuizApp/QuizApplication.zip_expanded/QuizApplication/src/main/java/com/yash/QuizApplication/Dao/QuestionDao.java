package com.yash.QuizApplication.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.QuizApplication.model.question;

@Repository
public interface QuestionDao extends JpaRepository<question, Integer>{

	List<question> findBydifficultyLevel(String level);

}
