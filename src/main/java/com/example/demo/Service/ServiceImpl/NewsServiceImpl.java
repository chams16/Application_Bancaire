package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.News;
import com.example.demo.Repository.NewsRepository;
import com.example.demo.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public News CreateNews(News news) {

        return newsRepository.save(news);
    }

    @Override
    public List<News> GetAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public List<News> getNewsByDate(Date date) {

        return newsRepository.findByNewsDate(date);
    }
}


