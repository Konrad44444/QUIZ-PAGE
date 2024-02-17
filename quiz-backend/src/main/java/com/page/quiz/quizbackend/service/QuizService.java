package com.page.quiz.quizbackend.service;

import java.util.List;

import com.page.quiz.quizbackend.model.Quiz;

public interface QuizService {
    List<Quiz> getAllQuestions();
    Quiz getQuestionById(String id);
    Quiz saveQuestion(Quiz quiz);
    Quiz updateQuestion(String id, Quiz quiz);
}
