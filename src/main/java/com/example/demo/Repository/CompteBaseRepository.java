package com.example.demo.Repository;

import com.example.demo.Model.Compte_Bancaire;
import com.example.demo.Model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface CompteBaseRepository <T extends Compte_Bancaire> extends JpaRepository<T,Long> {

    List<Compte_Bancaire> findByEntreprise(Entreprise entreprise);
}
