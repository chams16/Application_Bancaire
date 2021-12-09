package com.example.demo.Model;

import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Entreprise  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicatioUserId;

    @NotNull
    private int immatricule;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;

    @NotNull
    private String adresse;

}
