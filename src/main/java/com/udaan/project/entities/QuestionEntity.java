package com.udaan.project.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class QuestionEntity {
    private String questions;

    @OneToMany()
    @ElementCollection
    List<OptionEntity> options  = new ArrayList<>();
    private Long id;

    public List<OptionEntity> getOptions() {
        return options;
    }

    public void setOptions(List<OptionEntity> options) {
        this.options = options;
    }

    @ManyToMany()
    @ElementCollection
    private List<QuizEntity> quizEntityList = new ArrayList<>();

    private int answerId;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }
    public void setOptions(OptionEntity options) {
        this.options = (List<OptionEntity>) options;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
}
