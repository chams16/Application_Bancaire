package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Question;
import com.example.demo.Repository.QuestionRepository;
import com.example.demo.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question createQuestion(Question question) {
        question.setDepositDate(new Date());
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> getQuestionBySubject(String subject) {
        return questionRepository.findByQuestionTitle(subject);
    }

    @Override
    public List<Question> getQuestionByTitle(String title) {
        return questionRepository.findByQuestionSubject(title);
    }
}
