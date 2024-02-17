package com.page.quiz.quizbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.page.quiz.quizbackend.model.Quiz;

public interface QuizRepository extends MongoRepository<Quiz, String>{
    
}
