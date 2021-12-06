package com.example.demo.Service;

import com.example.demo.Model.Carte;

import java.util.List;

public interface CarteService {

    List<Carte> getAllCarte();
    Carte addCarte(Carte carte,Long entrepriseId);
    List<Carte> getCarteByEntreprise(Long entrepriseId);
}
