package com.page.quiz.quizbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.page.quiz.quizbackend.error.InvalidQuizIdException;
import com.page.quiz.quizbackend.error.QuizNotFoundException;
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
    public Quiz getQuizById(String id) throws QuizNotFoundException, InvalidQuizIdException {
        if(id == null) {
            throw new InvalidQuizIdException(id);
        }

        Optional<Quiz> quizOpt = quizRepository.findById(id);
        
        if(!quizOpt.isPresent()) {
            throw new QuizNotFoundException(id);
        }

        return quizOpt.get();
    }

    @Override
    public Quiz saveQuiz(Quiz quiz) {
        if(quiz.equals(null)) {
            throw new RuntimeException("Saved quiz cannot be null");
        }

        return quizRepository.insert(quiz);
    }

    @Override
    public Quiz updateQuiz(String id, Quiz quiz) throws QuizNotFoundException, InvalidQuizIdException {
        if(id == null) {
            throw new InvalidQuizIdException(id);
        }

        Optional<Quiz> quizOpt = quizRepository.findById(id);
        
        if(!quizOpt.isPresent()) {
            throw new QuizNotFoundException(id);
        }

        Quiz quizToUpdate = quizOpt.get();

        quizToUpdate.setTitle(quiz.getTitle());
        quizToUpdate.setQuestions(quiz.getQuestions());

        return quizRepository.save(quizToUpdate);
    }

    @Override
    public void deleteQuiz(String id) throws InvalidQuizIdException {
        if(id == null) {
            throw new InvalidQuizIdException(id);
        }

        quizRepository.deleteById(id);
    }
    
}
