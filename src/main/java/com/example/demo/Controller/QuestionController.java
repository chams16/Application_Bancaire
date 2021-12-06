package com.example.demo.Controller;


import com.example.demo.Model.Question;
import com.example.demo.Service.ServiceImpl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;

    @PostMapping("/create")
    public Question CreateQuestion(@RequestBody Question question){
        return questionService.createQuestion(question);
    }

    @GetMapping("/all")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/title/{title}")
    public List<Question> getQuestionByTitle(@PathVariable("title") String title){
        return questionService.getQuestionByTitle(title);
    }

    @GetMapping("/subject/{subject}")
    public List<Question> getQuestionBySubject(@PathVariable("subject") String subject){
        return questionService.getQuestionBySubject(subject);
    }
}
