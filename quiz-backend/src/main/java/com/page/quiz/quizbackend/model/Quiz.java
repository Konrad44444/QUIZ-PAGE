package com.page.quiz.quizbackend.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Quiz {
    @Id
    private String id;

    @NotBlank
    private String title;
    
    @Size(min = 2, max = 100)
    @Valid
    private List<Question> questions = new ArrayList<>();

    public Quiz(String title, List<Question> questions) {
        this.title = title;
        this.questions = questions;
    }
}
