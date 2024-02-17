package com.page.quiz.quizbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Answer {
    private String answer;
    private Boolean isCorrect;
}
