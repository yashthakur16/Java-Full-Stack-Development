package com.yash.quiz_service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.quiz_service.model.Quiz;



@Repository
public interface Quizdao extends JpaRepository<Quiz, Integer>{

}
