package com.example.demo.Service.ServiceImpl;

import com.example.demo.Repository.AnswerRepository;
import com.example.demo.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;
}
