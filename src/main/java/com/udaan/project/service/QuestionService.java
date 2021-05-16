package com.udaan.project.service;

import com.udaan.project.entities.QuestionEntity;
import com.udaan.project.repositories.QuestionRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    QuestionRepositories questionRepositories;

    public void saveQuestions(QuestionEntity questionEntity){
        questionRepositories.save(questionEntity);
    }
}
