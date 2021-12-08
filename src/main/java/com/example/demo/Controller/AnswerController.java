package com.example.demo.Controller;

import com.example.demo.Model.Answer;
import com.example.demo.Service.ServiceImpl.AnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerServiceImpl answerService;

    @GetMapping("/all")
    public List<Answer> getAllAnswer(){
        return answerService.getAllAnswer();
    }

    @PostMapping("/answer/{questionId}")
    public Answer answerQuestion(@PathVariable("questionId") Long questionId,@RequestBody Answer answer){
        return answerService.answerQuestion(answer,questionId);
    }

    @GetMapping("/{questionId}")
    public List<Answer> getAnsweerByQuestion(@PathVariable("questionId") Long questionId){
        return answerService.getQuestionAnswer(questionId);
    }
}
