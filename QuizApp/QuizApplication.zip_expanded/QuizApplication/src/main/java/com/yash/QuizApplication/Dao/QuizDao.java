package com.yash.QuizApplication.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.QuizApplication.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
