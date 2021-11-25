package com.example.demo.Service;

import com.example.demo.Model.Entreprise;

import java.util.List;
import java.util.Optional;

public interface EntrepriseService {

    Entreprise ajouterEntreprise(Entreprise entreprise);
    List<Entreprise> getAllEntreprise();
    Optional<Entreprise> GetEntrepriseById(Long Entreprise_Id);
    Optional<Entreprise> GetEntrepriseByName(String Ent_Name);
    Optional<Entreprise> GetEntrepriseByImmatricule(int Immatricule);

}
