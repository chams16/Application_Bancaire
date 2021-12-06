package com.example.demo.Model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    @NotNull
    private String answeringName;
    @NotNull
    private Date answerDate;
    @NotNull
    private String answerTitle;
    @NotNull
    private String answerSubject;
    @NotNull
    private String answerContent;
    @NotNull
    private int answerRate;

    @ManyToOne
    Question question;


}
