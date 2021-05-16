package com.udaan.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class QuizQuestionsEntity extends  BaseEntity {

    QuestionEntity questionEntity;
    QuizEntity quizEntity;

    private Long quesId = questionEntity.getId();
    private Long quizId = quizEntity.getId();

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

}
