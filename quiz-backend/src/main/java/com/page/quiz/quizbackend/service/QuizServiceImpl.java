package com.page.quiz.quizbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.page.quiz.quizbackend.model.Quiz;
import com.page.quiz.quizbackend.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{

    private final QuizRepository quizRepository;


    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public List<Quiz> getAllQuizes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuizById(String id) {
        if(id == null || id.equals("")) {
            throw new RuntimeException("Invalid id");
        }

        Optional<Quiz> quizOpt = quizRepository.findById(id);
        
        if(!quizOpt.isPresent()) {
            throw new RuntimeException("Quiz not found");
        }

        return quizOpt.get();
        // TODO implement exceptions
    }

    @Override
    public Quiz saveQuiz(Quiz quiz) {
        if(quiz.equals(null)) {
            throw new RuntimeException("Saved quiz cannot be null");
        }

        return quizRepository.insert(quiz);
        // TODO implement exceptions
    }

    @Override
    public Quiz updateQuiz(String id, Quiz quiz) {
        if(id == null || id.equals("")) {
            throw new RuntimeException("Invalid id");
        }

        Optional<Quiz> quizOpt = quizRepository.findById(id);
        
        if(!quizOpt.isPresent()) {
            throw new RuntimeException("Quiz not found");
        }

        Quiz quizToUpdate = quizOpt.get();

        quizToUpdate.setTitle(quiz.getTitle());
        quizToUpdate.setQuestions(quiz.getQuestions());

        return quizRepository.save(quizToUpdate);
        // TODO implement exceptions
    }

    @Override
    public void deleteQuiz(String id) {
        if(id == null || id.equals("")) {
            throw new RuntimeException("Invalid id");
        }

        quizRepository.deleteById(id);
    }
    
}
