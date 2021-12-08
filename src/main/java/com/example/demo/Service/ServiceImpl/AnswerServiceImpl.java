package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Answer;
import com.example.demo.Model.Question;
import com.example.demo.Repository.AnswerRepository;
import com.example.demo.Repository.QuestionRepository;
import com.example.demo.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;


    @Override
    public List<Answer> getAllAnswer() {
        return answerRepository.findAll();
    }

    @Override
    public Answer answerQuestion(Answer answer,Long questioId) {
        Question question = questionRepository.getById(questioId);
        answer.setQuestion(question);
        return answerRepository.save(answer);
    }

    @Override
    public List<Answer> getQuestionAnswer(Long questionId) {
        Question question = questionRepository.getById(questionId);

        return answerRepository.findByQuestion(question);
    }
}
