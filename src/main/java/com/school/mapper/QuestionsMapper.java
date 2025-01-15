package com.school.mapper;

import com.school.dto.QuestionsDto;
import com.school.entity.Questions;

public class QuestionsMapper {

    public static QuestionsDto mapToQuestionsDto(Questions questions){
        return new QuestionsDto(
            questions.getId(),
            questions.getQuestion()
        );
    }

    public static Questions mapToQuestions(QuestionsDto questionsDto){
        return new Questions(
            questionsDto.getId(),
            questionsDto.getQuestion()
        );
    }

}
