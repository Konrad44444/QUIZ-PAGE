package com.page.quiz.quizbackend.error;

public class InvalidQuizIdException extends Exception{
    public InvalidQuizIdException(String id) {
        super("Invalid quiz ID - should be String. Given quiz ID: " + id);
    }
}
