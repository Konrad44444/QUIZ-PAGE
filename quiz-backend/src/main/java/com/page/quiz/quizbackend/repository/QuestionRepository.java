package com.page.quiz.quizbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.page.quiz.quizbackend.model.Question;

public interface QuestionRepository extends MongoRepository<Question, String>{
    
}
