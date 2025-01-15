package com.school.service;
import java.util.List;
import com.school.dto.QuestionsDto;

public interface QuestionsService {
    QuestionsDto postQuestion(QuestionsDto questionsDto);
    List<QuestionsDto> getQuestions();
}
