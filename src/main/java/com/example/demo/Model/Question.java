package com.example.demo.Model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    @NotNull
    private String depositPersonName;
    @NotNull
    private Date depositDate;
    @NotNull
    private String questionSubject;
    @NotNull
    private String questionTitle;
    @NotNull
    private String questionContent;

}
