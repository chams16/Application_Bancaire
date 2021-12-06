package com.example.demo.Service;

import com.example.demo.Model.News;

import java.util.Date;
import java.util.List;

public interface NewsService {

    News CreateNews(News news);
    List<News> GetAllNews();
    List<News> getNewsByDate(Date date);
}
