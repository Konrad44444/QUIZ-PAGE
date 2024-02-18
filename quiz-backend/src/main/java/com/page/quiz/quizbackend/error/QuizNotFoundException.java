package com.page.quiz.quizbackend.error;

public class QuizNotFoundException extends Exception{
    public QuizNotFoundException(String id) {
        super("Quiz not found. Given quiz ID: " + id);
    }
}
