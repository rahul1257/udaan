package com.udaan.project.controllers;

import com.udaan.project.entities.QuestionEntity;
import com.udaan.project.entities.QuizEntity;
import com.udaan.project.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizContoller {
    @Autowired
    QuestionService questionService;

    @PostMapping("/questions")
    public void addQuestion(@RequestParam("questions") QuestionEntity questionEntity){
        //String ques =
        questionService.saveQuestions(questionEntity);
    }
}
