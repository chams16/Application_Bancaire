package com.example.demo.Repository;


import com.example.demo.Model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News,Long> {
    List<News> findByNewsDate(Date date);
}
