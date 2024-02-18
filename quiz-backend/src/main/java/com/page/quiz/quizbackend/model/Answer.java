package com.page.quiz.quizbackend.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Answer {
    @NotBlank
    private String answer;

    @NotNull
    private Boolean isCorrect;
}
