package com.example.demo.Model;

import javax.persistence.Entity;

@Entity
public class Professionelle extends Compte_Bancaire{

    private String Libellé;
    private Long Taux_interet;

    public String getLibellé() {
        return Libellé;
    }

    public void setLibellé(String libellé) {
        Libellé = libellé;
    }

    public Long getTaux_interet() {
        return Taux_interet;
    }

    public void setTaux_interet(Long taux_interet) {
        Taux_interet = taux_interet;
    }
}
