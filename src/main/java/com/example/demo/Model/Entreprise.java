package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
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



    public Long getEntreprise_Id() {
        return entreprise_Id;
    }

    public void setEntreprise_Id(Long entreprise_Id) {
        this.entreprise_Id = entreprise_Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnt_Name() {
        return ent_Name;
    }

    public void setEnt_Name(String ent_Name) {
        this.ent_Name = ent_Name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getImmatricule() {
        return immatricule;
    }

    public void setImmatricule(int immatricule) {
        this.immatricule = immatricule;
    }


}
