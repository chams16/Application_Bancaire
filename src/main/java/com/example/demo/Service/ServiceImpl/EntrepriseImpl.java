package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Entreprise;
import com.example.demo.Repository.EntrepriseRepository;
import com.example.demo.Service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.text.RandomStringGenerator;




import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseImpl implements EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public Entreprise ajouterEntreprise(Entreprise entreprise) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        RandomStringGenerator randomStringGenerator = new RandomStringGenerator.Builder()
                .selectFrom(chars.toCharArray())
                .build();

        entreprise.setPassword(randomStringGenerator.generate(len));

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
    public Optional<Entreprise> GetEntrepriseByName(String ent_Name) {
        return Optional.empty();
    }

    @Override
    public Optional<Entreprise> GetEntrepriseByImmatricule(int Immatricule) {
        return Optional.empty();
    }

    @Override
    public void DeleteById(Long id) {
        entrepriseRepository.deleteById(id);
    }
}
