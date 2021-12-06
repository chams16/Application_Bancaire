package com.example.demo.Service;

import com.example.demo.Model.Question;

import java.util.List;

public interface QuestionService {

    Question createQuestion(Question question);
    List<Question> getAllQuestion();
    List<Question>getQuestionBySubject(String subject);
    List<Question> getQuestionByTitle(String title);
}
