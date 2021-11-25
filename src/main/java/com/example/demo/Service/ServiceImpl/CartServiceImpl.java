package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Carte;
import com.example.demo.Repository.CarteRepository;
import com.example.demo.Service.CarteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        carte.setCreation_date(date);

        return carteRepository.save(carte);
    }
}
