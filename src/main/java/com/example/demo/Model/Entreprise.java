package com.example.demo.Model;

import javax.persistence.*;

@Entity
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Entreprise_Id;

    private String Email;
    private String Password;
    private String Ent_Name;
    private String adresse;
    private int Immatricule;

    public Long getEntreprise_Id() {
        return Entreprise_Id;
    }

    public void setEntreprise_Id(Long entreprise_Id) {
        Entreprise_Id = entreprise_Id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEnt_Name() {
        return Ent_Name;
    }

    public void setEnt_Name(String ent_Name) {
        Ent_Name = ent_Name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getImmatricule() {
        return Immatricule;
    }

    public void setImmatricule(int immatricule) {
        Immatricule = immatricule;
    }
}
