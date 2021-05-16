package com.udaan.project.entities;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class QuizEntity extends BaseEntity {
    private String quizname;

    @ManyToMany
    @ElementCollection
    List<QuestionEntity> questionEntityList = new ArrayList<>();

    public String getQuizname() {
        return quizname;
    }

    public void setQuizname(String quizname) {
        this.quizname = quizname;
    }
}
