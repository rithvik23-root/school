package com.school.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dto.QuestionsDto;
import com.school.entity.Questions;
import com.school.mapper.QuestionsMapper;
import com.school.repository.QuestionsRepository;
import com.school.service.QuestionsService;

@Service
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsRepository questionsRepository;

    @Override
    public QuestionsDto postQuestion(QuestionsDto questionsDto){
        Questions questions=QuestionsMapper.mapToQuestions(questionsDto);
        Questions savedQuestions=this.questionsRepository.save(questions);

        QuestionsDto x=QuestionsMapper.mapToQuestionsDto(savedQuestions);
        return x;
    }
    public List<QuestionsDto> getQuestions(){
        List<Questions> g=this.questionsRepository.findAll();
        List<QuestionsDto> res=new ArrayList<>();
        for(Questions x:g){
            QuestionsDto c=QuestionsMapper.mapToQuestionsDto(x);
            res.add(c);
        }
        return res;
    }
}
