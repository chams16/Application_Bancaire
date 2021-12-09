package com.example.demo.Model;

import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bank_Agent  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicatioUserId;


    @NotNull
    private String bank_name;

    @NotNull
    private String agency_address;

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;

    @NotNull
    private String adresse;

}
