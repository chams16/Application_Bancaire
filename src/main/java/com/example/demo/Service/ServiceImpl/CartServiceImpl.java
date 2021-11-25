package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Carte;
import com.example.demo.Repository.CarteRepository;
import com.example.demo.Service.CarteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CarteService {

    @Autowired
    private CarteRepository carteRepository;

    @Override
    public List<Carte> getAllCarte() {
        return carteRepository.findAll();
    }

    @Override
    public Carte addCarte(Carte carte) {
        return carteRepository.save(carte);
    }
}
