package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Entreprise;
import com.example.demo.Repository.EntrepriseRepository;
import com.example.demo.Service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseImpl implements EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public Entreprise ajouterEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> getAllEntreprise() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Optional<Entreprise> GetEntrepriseById(Long Entreprise_Id) {
        return entrepriseRepository.findById(Entreprise_Id);
    }

    @Override
    public Optional<Entreprise> GetEntrepriseByName(String Ent_Name) {
        return Optional.empty();
    }

    @Override
    public Optional<Entreprise> GetEntrepriseByImmatricule(int Immatricule) {
        return Optional.empty();
    }
}
