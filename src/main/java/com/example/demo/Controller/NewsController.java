package com.example.demo.Controller;

import com.example.demo.Model.News;
import com.example.demo.Service.ServiceImpl.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsServiceImpl newsService;

    @GetMapping("/all")
    public List<News> getAllNews(){
        return newsService.GetAllNews();
    }

    @PostMapping("/create")
    public News CreateNews(@RequestBody News news){
        return newsService.CreateNews(news);
    }

    @GetMapping("/today")
    public List<News> getByDate(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
        return newsService.getNewsByDate(date);
    }


}
