package com.yash.QuizApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Entity
public class question {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @JsonProperty("question_title")
    private String questionTitle;

    @JsonProperty("option1")
    private String option1;

    @JsonProperty("option2")
    private String option2;

    @JsonProperty("option3")
    private String option3;

    @JsonProperty("option4")
    private String option4;

    @JsonProperty("right_answer")
    private String rightAnswer;

    @JsonProperty("difficulty_level")
    private String difficultyLevel;
}