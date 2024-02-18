package com.page.quiz.quizbackend.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @NotBlank
    private String question;

    @Size(min = 4, max = 4)
    @Valid
    private List<Answer> answers = new ArrayList<>(4);
}
