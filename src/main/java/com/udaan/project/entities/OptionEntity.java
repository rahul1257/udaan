package com.udaan.project.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class OptionEntity extends  BaseEntity {

    @ManyToOne()
    private QuestionEntity questionEntity;

    private String optionValue;
    private Long quesId = questionEntity.getId();

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }
}
