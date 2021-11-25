package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entreprise_Id;

    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String ent_Name;
    @NotNull
    private String adresse;
    @NotNull
    private int immatricule;


    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Carte> cartes;



}
