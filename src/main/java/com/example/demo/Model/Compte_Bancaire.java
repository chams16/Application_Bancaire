package com.example.demo.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public abstract class Compte_Bancaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compte_id;

    @ManyToOne
    private Entreprise entreprise;

    private Long num_compte;
    private Date creation_date;
    private Long solde;

    public Long getCompte_id() {
        return compte_id;
    }

    public void setCompte_id(Long compte_id) {
        this.compte_id = compte_id;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Long getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(Long num_compte) {
        this.num_compte = num_compte;
    }

    public Long getSolde() {
        return solde;
    }

    public void setSolde(Long solde) {
        this.solde = solde;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }
}
