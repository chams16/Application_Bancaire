package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Bank_Id;

    private String Bank_name;
    private String adresse;
    private String Agent_name;
    private String password;


    public Long getBank_Id() {
        return Bank_Id;
    }

    public void setBank_Id(Long bank_Id) {
        Bank_Id = bank_Id;
    }

    public String getBank_name() {
        return Bank_name;
    }

    public void setBank_name(String bank_name) {
        Bank_name = bank_name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
