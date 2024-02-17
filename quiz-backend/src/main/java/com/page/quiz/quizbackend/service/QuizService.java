package com.page.quiz.quizbackend.service;

import java.util.List;

import com.page.quiz.quizbackend.model.Quiz;

public interface QuizService {
    List<Quiz> getAllQuizes();
    Quiz getQuizById(String id);
    Quiz saveQuiz(Quiz quiz);
    Quiz updateQuiz(String id, Quiz quiz);
    void deleteQuiz(String id);
}
