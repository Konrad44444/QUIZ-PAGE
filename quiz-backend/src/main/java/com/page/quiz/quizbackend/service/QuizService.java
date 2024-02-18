package com.page.quiz.quizbackend.service;

import java.util.List;

import com.page.quiz.quizbackend.error.InvalidQuizIdException;
import com.page.quiz.quizbackend.error.QuizNotFoundException;
import com.page.quiz.quizbackend.model.Quiz;

public interface QuizService {
    List<Quiz> getAllQuizes();
    Quiz getQuizById(String id) throws QuizNotFoundException, InvalidQuizIdException;
    Quiz saveQuiz(Quiz quiz);
    Quiz updateQuiz(String id, Quiz quiz) throws QuizNotFoundException, InvalidQuizIdException ;
    void deleteQuiz(String id) throws InvalidQuizIdException ;
}
