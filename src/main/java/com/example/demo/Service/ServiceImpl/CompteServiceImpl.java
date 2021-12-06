package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Compte_Bancaire;
import com.example.demo.Model.Entreprise;
import com.example.demo.Repository.CompteRepository;
import com.example.demo.Repository.EntrepriseRepository;
import com.example.demo.Service.CompteService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class CompteServiceImpl implements CompteService {

    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public Compte_Bancaire createNewAccount(Compte_Bancaire compte_bancaire,Long entrepriseId){
        Date date = new Date(System.currentTimeMillis());
        compte_bancaire.setCreation_date(date);
        Random random = new Random();
        compte_bancaire.setNum_compte(random.nextLong());
        Entreprise entreprise =  entrepriseRepository.findById(entrepriseId).orElseThrow(() ->
                new RuntimeException("No entre found"));
        compte_bancaire.setEntreprise(entreprise);
        return compteRepository.save(compte_bancaire);
    }
    private static String generateRandomPassword(int len) {
        return RandomStringUtils.randomNumeric(len);
    }

    @Override
    public List<Compte_Bancaire> getAllAccount() {
        return compteRepository.findAll();
    }

    @Override
    public Optional<Compte_Bancaire> getAccountById(Long compte_id) {
        return compteRepository.findById(compte_id);
    }

    @Override
    public List<Compte_Bancaire> getAccountByEntreprise(Long entrepriseId) {
        Entreprise entreprise =  entrepriseRepository.findById(entrepriseId).orElseThrow(() ->
                new RuntimeException("No entre found"));
        return compteRepository.findByEntreprise(entreprise);
    }
}
