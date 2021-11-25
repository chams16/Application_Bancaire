package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Compte_Bancaire;
import com.example.demo.Model.Entreprise;
import com.example.demo.Repository.CompteRepository;
import com.example.demo.Service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteServiceImpl implements CompteService {

    @Autowired
    private CompteRepository compteRepository;


    @Override
    public List<Compte_Bancaire> getAllAccount() {
        return compteRepository.findAll();
    }

    @Override
    public Optional<Compte_Bancaire> getAccountById(Long compte_id) {
        return compteRepository.findById(compte_id);
    }

    @Override
    public Optional<Compte_Bancaire> getAccountByEntreprise(Entreprise entreprise) {
        return compteRepository.findByEntreprise(entreprise);
    }
}
