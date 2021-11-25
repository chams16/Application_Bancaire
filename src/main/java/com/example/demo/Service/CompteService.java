package com.example.demo.Service;

import com.example.demo.Model.Compte_Bancaire;
import com.example.demo.Model.Entreprise;

import java.util.List;
import java.util.Optional;

public interface CompteService {

    List<Compte_Bancaire> getAllAccount();
    Optional<Compte_Bancaire> getAccountById(Long Compte_id);
    Optional<Compte_Bancaire> getAccountByEntreprise(Entreprise entreprise);

}
