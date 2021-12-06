package com.example.demo.Service;

import com.example.demo.Model.Compte_Bancaire;
import com.example.demo.Model.Entreprise;

import java.util.List;
import java.util.Optional;

public interface CompteService {

    List<Compte_Bancaire> getAllAccount();
    Optional<Compte_Bancaire> getAccountById(Long Compte_id);
    List<Compte_Bancaire> getAccountByEntreprise(Long entrepriseId);
    Compte_Bancaire createNewAccount(Compte_Bancaire compte_bancaire,Long entrepriseId);

}
