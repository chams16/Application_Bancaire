package com.example.demo.Service;

import com.example.demo.Model.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> getAllAnswer();
    Answer answerQuestion(Answer answer,Long questionId);
    List<Answer> getQuestionAnswer(Long answerId);


}
