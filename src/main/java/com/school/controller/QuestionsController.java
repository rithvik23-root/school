package com.school.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.dto.QuestionsDto;
import com.school.service.QuestionsService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@AllArgsConstructor
@RequestMapping("/api/questions")
public class QuestionsController {
    private QuestionsService questionsService;
    @PostMapping
    public ResponseEntity<QuestionsDto> postQuestion(@RequestBody QuestionsDto questionsDto){
        QuestionsDto s=questionsService.postQuestion(questionsDto);
        return new ResponseEntity<>(s,HttpStatus.CREATED);
    }
    @GetMapping()
    public  ResponseEntity<List<QuestionsDto>> getQuestions() {
        List<QuestionsDto> c=questionsService.getQuestions();
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
    
}
