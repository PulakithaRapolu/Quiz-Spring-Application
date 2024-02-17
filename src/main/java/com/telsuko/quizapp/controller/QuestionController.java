package com.telsuko.quizapp.controller;
import org.springframework.web.bind.annotation.RestController;

import com.telsuko.quizapp.model.Question;
import com.telsuko.quizapp.service.QuestionService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

;;
@RestController
@RequestMapping("question")
public class QuestionController {
   // @Autowired
   // PlayersService playersService;

   @Autowired
   QuestionService questionService;

   @GetMapping("allQuestion")
   public List<Question> getAllQuestions(){
    return questionService.getAllQuestions();
   }

}
