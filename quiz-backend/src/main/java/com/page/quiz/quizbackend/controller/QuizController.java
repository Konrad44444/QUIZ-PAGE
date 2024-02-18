package com.page.quiz.quizbackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.page.quiz.quizbackend.error.InvalidQuizIdException;
import com.page.quiz.quizbackend.error.QuizNotFoundException;
import com.page.quiz.quizbackend.model.Quiz;
import com.page.quiz.quizbackend.service.QuizService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    private static final String EMPTY_MAPPING = "/";
    private static final String ID_VARIABLE_MAPPING = "/{id}";

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping(EMPTY_MAPPING)
    public ResponseEntity<List<Quiz>> getAllQuizes() {
        return new ResponseEntity<>(quizService.getAllQuizes(), HttpStatus.OK);
    }

    @GetMapping(ID_VARIABLE_MAPPING)
    public ResponseEntity<Quiz> getQuizById(@PathVariable String id) {
        try {
            Quiz quiz = quizService.getQuizById(id);
            return new ResponseEntity<>(quiz, HttpStatus.OK);
        } catch (QuizNotFoundException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage(), ex);
        } catch (InvalidQuizIdException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }

    @PostMapping(EMPTY_MAPPING)
    public ResponseEntity<Quiz> saveQuiz(@RequestBody Quiz quiz) {
        try {
            return new ResponseEntity<>(quizService.saveQuiz(quiz), HttpStatus.CREATED);
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
    
    @PutMapping(ID_VARIABLE_MAPPING)
    public ResponseEntity<Quiz> updateQuiz(@PathVariable String id, @RequestBody Quiz entity) {
        try {
            return new ResponseEntity<>(quizService.updateQuiz(id, entity), HttpStatus.OK);
        } catch (QuizNotFoundException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage(), ex);
        } catch (InvalidQuizIdException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }

    @DeleteMapping(ID_VARIABLE_MAPPING)
    public ResponseEntity<Void> deleteQuiz(@PathVariable String id) {
        try {
            quizService.deleteQuiz(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (InvalidQuizIdException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
    
}
