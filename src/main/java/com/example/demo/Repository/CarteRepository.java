package com.example.demo.Repository;

import com.example.demo.Model.Carte;
import com.example.demo.Model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarteRepository extends JpaRepository<Carte,Long> {
    List<Carte> findByEntreprise(Entreprise entreprise);
}
