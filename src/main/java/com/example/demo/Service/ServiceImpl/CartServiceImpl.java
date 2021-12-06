package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Carte;
import com.example.demo.Model.Entreprise;
import com.example.demo.Repository.CarteRepository;
import com.example.demo.Repository.EntrepriseRepository;
import com.example.demo.Service.CarteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CarteService {

    @Autowired
    private CarteRepository carteRepository;
    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public List<Carte> getAllCarte() {
        return carteRepository.findAll();
    }

    @Override
    public Carte addCarte(Carte carte,Long entrepriseId) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        carte.setCreation_date(date);
        Entreprise entreprise =  entrepriseRepository.findById(entrepriseId).orElseThrow(() ->
                new RuntimeException("No entre found"));
        carte.setEntreprise(entreprise);


        return carteRepository.save(carte);
    }

    @Override
    public List<Carte> getCarteByEntreprise(Long entrepriseId){
        Entreprise entreprise =  entrepriseRepository.findById(entrepriseId).orElseThrow(() ->
                new RuntimeException("No entre found"));
        return carteRepository.findByEntreprise(entreprise);
    }
}
